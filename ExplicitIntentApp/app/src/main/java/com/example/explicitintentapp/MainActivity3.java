package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btnSubmit, btnCancel;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnCancel = findViewById(R.id.btnCancel3);
        btnSubmit = findViewById(R.id.btnSubmit3);
        editText = findViewById(R.id.etText3);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity3.this,"Please enter a text",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent();
                    intent.putExtra("returnData",editText.getText().toString().trim());
                    setResult(RESULT_OK,intent);
                    finishActivity(3);
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("returnData","Operation Aborted !");
                setResult(RESULT_CANCELED,intent);
                finishActivity(3);
            }
        });
    }
}