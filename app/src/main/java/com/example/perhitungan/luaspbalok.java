package com.example.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luaspbalok extends AppCompatActivity implements View.OnClickListener {
    EditText panjang1, lebar1, tinggi1;
    TextView hasil1;
    Button jumlah, kembal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luaspbalok);

        panjang1 = findViewById(R.id.sisi);
        lebar1 = findViewById(R.id.lebar);
        tinggi1 = findViewById(R.id.tinggi);
        hasil1 = findViewById(R.id.hasil);

        jumlah = findViewById(R.id.jumlahkan);
        kembal = findViewById(R.id.kembali);
        jumlah.setOnClickListener(this);
        kembal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String panjan = panjang1.getText().toString().trim();
        String tingg = tinggi1.getText().toString().trim();
        String leba = lebar1.getText().toString().trim();

        boolean kosong = false;
        boolean invalid = false;

        if (TextUtils.isEmpty(panjan)) {
            kosong = true;
            panjang1.setError("Wajib di isi");
        }
        if (TextUtils.isEmpty(tingg)) {
            kosong = true;
            tinggi1.setError("Wajib di isi");
        }
        if (TextUtils.isEmpty(leba)) {
            kosong = true;
            lebar1.setError("Wajib di isi");
        }
        Double panjangg = toDouble(panjan);
        Double tingi = toDouble(tingg);
        Double lebbar = toDouble(leba);

        if (panjangg == null) {
            invalid = true;
            panjang1.setError("Invalid, Masukan angka");
        }
        if (tingi == null) {
            invalid = true;
            tinggi1.setError("Invalid, Masukan angka");
        }
        if (lebbar == null) {
            invalid = true;
            lebar1.setError("Invalid, Masukan angka");
        }
        if (view.getId() == R.id.jumlahkan) {
            if (!kosong && !invalid) {
                double volume = 2 * ((panjangg*lebbar) + (panjangg+tingi) + (lebbar*tingi));
                hasil1.setText(String.valueOf(volume));
            }
        }
        if (view.getId() == R.id.kembali) {
            finish();
        }
    }
    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}