package com.example.bambangsulistyo.hablumminannas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityNasihat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nasihat);
    }

    public void buttonKembali(View view) {
        Intent kembaliTampil = new Intent(this,MainActivity.class);
        startActivity(kembaliTampil);
    }
}
