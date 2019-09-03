package com.example.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perhitungan extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan);

        Button kkubus = findViewById(R.id.kubus);
        kkubus.setOnClickListener(this);
        Button kembal = findViewById(R.id.kembali);
        kembal.setOnClickListener(this);
        Button balokk = findViewById(R.id.balok);
        balokk.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
           if (view.getId() == R.id.kubus){
               Intent intent = new Intent(perhitungan.this, Hkubus.class);
               startActivity(intent);
           }

           if (view.getId() == R.id.balok){
               Intent intent1 = new Intent(perhitungan.this, Hbalok.class);
               startActivity(intent1);
           }
           if (view.getId() == R.id.kembali){
            finish();
        }
    }
}
