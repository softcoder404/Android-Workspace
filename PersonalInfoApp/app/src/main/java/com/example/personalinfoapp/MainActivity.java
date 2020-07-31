package com.example.personalinfoapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCreate;
    ImageView imgCall, imgWeb, imgLocation;
    LinearLayout hiddenLayout;
    final int REQUESTCODE = 1;
    String phone, website, location, name, mood = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hiddenLayout = findViewById(R.id.hiddenLayout);
        btnCreate = findViewById(R.id.btnCreate);
        imgCall = findViewById(R.id.imgCall);
        imgWeb = findViewById(R.id.imgWeb);
        imgLocation = findViewById(R.id.imgLocation);
        hiddenLayout.setVisibility(View.GONE);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.example.personalinfoapp.FormActivity.class);
                startActivityForResult(intent,REQUESTCODE);
            }
        });

        imgCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+phone));
                    startActivity(intent);
            }
        });
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+website));
                    startActivity(intent);
            }
        });

        imgLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+location));
                    startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUESTCODE){
            if(resultCode == RESULT_OK){
                phone = data.getStringExtra("phone");
                website = data.getStringExtra("website");
                location = data.getStringExtra("location");
                name = data.getStringExtra("name");
                mood = data.getStringExtra("mood");
            }else if(requestCode == RESULT_CANCELED){
                hiddenLayout.setVisibility(View.GONE);
            }
        }
    }


}