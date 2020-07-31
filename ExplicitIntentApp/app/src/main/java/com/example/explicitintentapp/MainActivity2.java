package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvRes;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvRes = findViewById(R.id.tvRes);
        btnCancel = findViewById(R.id.btnCancel2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("fullName");
        tvRes.setText("Hi "+name);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            MainActivity2.this.finish();
            }
        });
    }
}