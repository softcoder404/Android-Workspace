package com.example.explicitintentapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
    final int REQUESTCODE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity2 = findViewById(R.id.btnAct2);
        btnActivity3 = findViewById(R.id.btnAct3);
        editText = findViewById(R.id.etText3);
        tvRes = findViewById(R.id.tvRes);
        tvRes.setVisibility(View.GONE);
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
                    startActivityForResult(intent,REQUESTCODE);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUESTCODE){

            if (resultCode == RESULT_OK){
                tvRes.setText(data.getStringExtra("returnData"));
                tvRes.setVisibility(View.VISIBLE);
            }
            else if(resultCode == RESULT_CANCELED){
                if(data == null){
                    tvRes.setText("Empty Data Returned !");
                    tvRes.setVisibility(View.VISIBLE);
                }else{
                    tvRes.setText(data.getStringExtra("returnData"));
                    tvRes.setVisibility(View.VISIBLE);
                }
            }
        }
    }
}