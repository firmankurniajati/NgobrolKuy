package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    private ImageView chatpersonal;
    private TextView chat1;
    private TextView isichat;
    private ImageView titik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        getSupportActionBar().hide();
        chatpersonal = findViewById(R.id.img1);
        chat1 = findViewById(R.id.nama1);
        isichat = findViewById(R.id.chat1);
        titik = findViewById(R.id.dots);

        titik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ChatActivity.this, SettingsActivity.class);
                startActivity(pindah);
            }
        });


        chatpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ChatActivity.this, chatPersonalActivity.class);
                startActivity(pindah);
            }
        });
        chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ChatActivity.this, chatPersonalActivity.class);
                startActivity(pindah);
            }
        });
        isichat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ChatActivity.this, chatPersonalActivity.class);
                startActivity(pindah);
            }
        });



    }
}