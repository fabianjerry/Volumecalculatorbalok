package com.guefabian.volumecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variabel

    EditText panjangbalok, lebarbalok, tinggibalok;
    Button hitung;
    TextView hasil;

    double panjang;
    double lebar;
    double tinggi;

    //hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panjangbalok = (EditText) findViewById(R.id.panjangbalok);
        lebarbalok = (EditText) findViewById(R.id.lebarbalok);
        tinggibalok = (EditText) findViewById(R.id.tinggibalok);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Volume();
            }
        });
    }

    public void Volume() {
        if (panjangbalok.getText().toString().isEmpty()) {
            Toast.makeText(this, "Panjang jangan kosong please", Toast.LENGTH_SHORT).show();
        }
        if (lebarbalok.getText().toString().isEmpty()) {
            Toast.makeText(this, "Lebar jangan kosong please", Toast.LENGTH_SHORT).show();
        }
        if (tinggibalok.getText().toString().isEmpty()) {
            Toast.makeText(this, "Tinggi jangan kosong please", Toast.LENGTH_SHORT).show();
        }
        try {
            panjang = Double.parseDouble(panjangbalok.getText().toString());
        } catch (Exception e) {
        }
        try {
            lebar = Double.parseDouble(lebarbalok.getText().toString());
        } catch (Exception e) {
        }
        try {
            tinggi = Double.parseDouble(tinggibalok.getText().toString());
        } catch (Exception e) {
        }
        double result = panjang*lebar*tinggi;
        hasil.setText("Volume = "+String.valueOf(result));

    }
}