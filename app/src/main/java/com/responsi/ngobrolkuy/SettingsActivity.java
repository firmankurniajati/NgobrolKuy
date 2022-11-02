package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private Button gantipass;
    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        gantipass = findViewById(R.id.btnGantipassword);
        kembali = findViewById(R.id.Kembali);

        getSupportActionBar().hide();

        gantipass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SettingsActivity.this, LupapasswordActivity.class);
                startActivity(pindah);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SettingsActivity.this, ChatActivity.class);
                startActivity(pindah);
            }
        });

    }
}