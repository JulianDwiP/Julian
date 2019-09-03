package com.example.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hbalok extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hbalok);

        Button luass = findViewById(R.id.luas);
        Button volum = findViewById(R.id.volume);
        luass.setOnClickListener(this);
        volum.setOnClickListener(this);
        Button kembal = findViewById(R.id.kembali);
        kembal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.luas){
            Intent intent = new Intent(Hbalok.this, luaspbalok.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.volume){
            Intent intent = new Intent(Hbalok.this, volumeB.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.kembali){
            finish();
        }
    }
}
