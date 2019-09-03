package com.example.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Luasp extends AppCompatActivity implements View.OnClickListener {

    EditText sisi1;
    TextView hasil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luasp);

        sisi1 = findViewById(R.id.sisi);
        hasil1 = findViewById(R.id.hasil);

        Button jumlah = findViewById(R.id.jumlahkan);
        Button kembal = findViewById(R.id.kembali);
        jumlah.setOnClickListener(this);
        kembal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sis = sisi1.getText().toString().trim();

        boolean kosong = false;
        boolean invalid = false;

        if (TextUtils.isEmpty(sis)) {
            kosong = true;
            sisi1.setError("Harus di isi");
        }
        Double sisii = toDouble(sis);
        if (sisii == null){
            invalid = true;
            sisi1.setError("Invalid, Masukan Angka");
        }
        if (!kosong && !invalid) {
            double volume = 6 * (sisii * sisii);

            hasil1.setText(String.valueOf(volume));
        }
        if (v.getId() == R.id.kembali){
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
