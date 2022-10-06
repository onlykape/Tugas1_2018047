package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_als);
        final EditText tinggi = (EditText)findViewById(R.id.input_t);
        final EditText hasil = (EditText)findViewById(R.id.output_h);
        final Button tampil2 = (Button)findViewById(R.id.btn_tampil2);
        tampil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double alas1, tinggi1, hasil1;
                alas1 = Double.valueOf(alas.getText().toString().trim());
                tinggi1 = Double.valueOf(tinggi.getText().toString().trim());
                hasil1 = (alas1/2)*tinggi1;
                String hasil2 = String.valueOf(hasil1);
                hasil.setText(hasil2);
            }
        });
    }
}