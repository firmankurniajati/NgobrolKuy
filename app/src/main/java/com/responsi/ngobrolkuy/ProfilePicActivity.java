package com.responsi.ngobrolkuy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilePicActivity extends AppCompatActivity {
    private ImageView tambahfoto;
    private static final int GALLERY_REQUEST_CODE = 1;
    private static final String TAG = RegisterActivity.class.getCanonicalName();
    private Bitmap bitmap;
    private Uri imgUri = null;
    private boolean change_img = false;
    private ImageView avatar, change_Avatar;
    private TextView lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        getSupportActionBar().hide();

        tambahfoto = (ImageView) findViewById(R.id.ubah);
        avatar = findViewById(R.id.profilePic);
        lanjut = findViewById(R.id.lanjut);

        tambahfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI), GALLERY_REQUEST_CODE);
            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Cancel input image", Toast.LENGTH_SHORT).show();
                return;
            } else {
                if (requestCode == GALLERY_REQUEST_CODE) {
                    if (data != null) {
                        try {
                            change_img = true;
                            imgUri = data.getData();
                            bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imgUri);
                            avatar.setImageBitmap(bitmap);
                        } catch (IOException e) {
                            Toast.makeText(this, "Can't load image", Toast.LENGTH_SHORT).show();
                            Log.e(TAG, e.getMessage());
                        }
                    }
                }
            }

            lanjut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent pindah = new Intent(ProfilePicActivity.this, ChatActivity.class);
                    startActivity(pindah);
                }
            });
    }
}
