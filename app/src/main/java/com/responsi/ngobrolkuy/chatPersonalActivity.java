package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class chatPersonalActivity extends AppCompatActivity {

    private TextView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_personal);

        kembali = findViewById(R.id.kembali2);
        getSupportActionBar().hide();
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(chatPersonalActivity.this, ChatActivity.class);
                startActivity(pindah);
            }
        });
    }
}