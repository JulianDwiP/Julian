package com.example.perhitungan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        Button log = findViewById(R.id.btnLog);
        log.setOnClickListener(this);
        Button kel = findViewById(R.id.btnKel);
        kel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String pas = pass.getText().toString().trim();
        String useer = user.getText().toString().trim();

        boolean kosong = false;
        if (view.getId() == R.id.btnKel){
            finish();
        }
        if (view.getId() == R.id.btnLog){
            if(TextUtils.isEmpty(pas)){
                kosong = true;
                pass.setError("Wajib di isi");
                //Snackbar b = Snackbar.make(findViewById(R.id.main), "Wajib di isi", Snackbar.LENGTH_LONG);
                //b.show();
        }
            if(TextUtils.isEmpty(useer)){
                kosong = true;
                user.setError("Wajib di isi");
            }
            if(!kosong){
                Intent intent = new Intent(MainActivity.this, perhitungan.class );
                startActivity(intent);
            }

        }
    }
}
