package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView regist;
    private TextView punyaakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        regist = findViewById(R.id.register2);
        punyaakun = findViewById(R.id.sudahpunyaakun);

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(RegisterActivity.this, ProfilePicActivity.class);
                startActivity(pindah);
            }
        });

        punyaakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });
    }
}
