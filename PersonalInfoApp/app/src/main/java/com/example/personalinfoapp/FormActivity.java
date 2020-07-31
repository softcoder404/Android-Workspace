package com.example.personalinfoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    EditText etName, etNumber, etWebsite, etLocation;
    ImageView imgGood, imgFair, imgSad;
    String name,phone,website,location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        imgFair = findViewById(R.id.imgFair);
        imgGood = findViewById(R.id.imgGood);
        imgSad = findViewById(R.id.imgSad);
         imgFair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = etName.getText().toString().trim();
                phone = etNumber.getText().toString().trim();
                website = etWebsite.getText().toString().trim();
                location = etLocation.getText().toString().trim();

                if(name.isEmpty() || phone.isEmpty() || website.isEmpty() || location.isEmpty() ){
                    Toast.makeText(FormActivity.this,"All field are required",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent();
                    intent.putExtra("name",name);
                    intent.putExtra("phone",phone);
                    intent.putExtra("website",website);
                    intent.putExtra("location",location);
                    setResult(RESULT_OK,intent);
                    finishActivity(3);
                }
            }
        });
    }
}