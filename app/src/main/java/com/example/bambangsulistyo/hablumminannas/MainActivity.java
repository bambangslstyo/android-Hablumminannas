package com.example.bambangsulistyo.hablumminannas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mengucapkanSalam(View view) {
        Intent mengucapkanSalamTampil = new Intent(this,MengucapkanSalam.class);
        Toast.makeText(getApplicationContext(), "Mengucapkan Salam",
                Toast.LENGTH_SHORT).show();
        startActivity(mengucapkanSalamTampil);
    }

    public void undangan(View view) {
        Intent undanganTampil = new Intent(this,MainActivityUndangan.class);
        Toast.makeText(getApplicationContext(), "Memenuhi Undangan",
                Toast.LENGTH_SHORT).show();
        startActivity(undanganTampil);
    }

    public void nasihat(View view) {
        Intent nasihatTampil = new Intent(this,MainActivityNasihat.class);
        Toast.makeText(getApplicationContext(), "Memberi Nasihat",
                Toast.LENGTH_SHORT).show();
        startActivity(nasihatTampil);
    }

    public void bersin(View view) {
        Intent bersinTampil = new Intent(this,MainActivityBersin.class);
        Toast.makeText(getApplicationContext(), "Menjawab Hamdalah Saat Bersin: Yarhamukallah",
                Toast.LENGTH_SHORT).show();
        startActivity(bersinTampil);
    }

    public void sakit(View view) {
        Intent sakitTampil = new Intent(this,MainActivitySakit.class);
        Toast.makeText(getApplicationContext(), "Membesuknya Saat Sakit",
                Toast.LENGTH_SHORT).show();
        startActivity(sakitTampil);
    }

    public void jenazah(View view) {
        Intent jenazahTampil = new Intent(this,MainActivityJenazah.class);
        Toast.makeText(getApplicationContext(), "Mengantarkan Jenazah",
                Toast.LENGTH_SHORT).show();
        startActivity(jenazahTampil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activitymain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent aboutTampil = new Intent(this,MainActivityAbout.class);
            startActivity(aboutTampil);
        }
        else if (id == R.id.action_exit){
            AlertDialog.Builder builder = new  AlertDialog.Builder(this);
            builder.setMessage("Apakah Anda Benar-Benar Ingin Keluar?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            }).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
