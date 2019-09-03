package com.example.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hkubus extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hkubus);

        Button luass = findViewById(R.id.luas);
        Button volum = findViewById(R.id.volume);
        luass.setOnClickListener(this);
        volum.setOnClickListener(this);
        Button kembal = findViewById(R.id.kembali);
        kembal.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.luas){
            Intent intent = new Intent(Hkubus.this, Luasp.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.volume){
            Intent intent = new Intent(Hkubus.this, volumeK.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.kembali){
            finish();
        }
    }
}
