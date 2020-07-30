package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnActivity2, btnActivity3;
    EditText editText;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity2 = findViewById(R.id.btnAct2);
        btnActivity3 = findViewById(R.id.btnAct3);
        editText = findViewById(R.id.etName);
        tvRes = findViewById(R.id.tvRes);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter Your name",Toast.LENGTH_SHORT).show();
                }else{
                    String fullName = editText.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,
                            com.example.explicitintentapp.MainActivity2.class
                    );
                    //pass in your data to the intent
                    intent.putExtra("fullName",fullName);
                    startActivity(intent);
                }
            }
        });

        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter Your Name",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,
                            com.example.explicitintentapp.MainActivity3.class);
                    intent.putExtra("fullName",editText.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });
    }
}