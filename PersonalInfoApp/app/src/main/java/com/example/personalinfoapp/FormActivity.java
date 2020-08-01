package com.example.personalinfoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Array;

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
        etNumber = findViewById(R.id.etNumber);
        etName = findViewById(R.id.etName);
        etLocation = findViewById(R.id.etLoc);
        etWebsite = findViewById(R.id.etWeb);

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
                    Bundle bundle = new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("phone",phone);
                    bundle.putString("website",website);
                    bundle.putString("location",location);
                    bundle.putString("mood","fair");
                    intent.putExtras(bundle);
                    setResult(RESULT_OK,intent);
                    FormActivity.this.finish();
                }
            }
        });
        imgSad.setOnClickListener(new View.OnClickListener() {
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
                    Bundle bundle = new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("phone",phone);
                    bundle.putString("website",website);
                    bundle.putString("location",location);
                    bundle.putString("mood","sad");
                    intent.putExtras(bundle);
                    setResult(RESULT_OK,intent);
                    FormActivity.this.finish();
                }
            }
        });
        imgGood.setOnClickListener(new View.OnClickListener() {
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
                    Bundle bundle = new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("phone",phone);
                    bundle.putString("website",website);
                    bundle.putString("location",location);
                    bundle.putString("mood","good");
                    intent.putExtras(bundle);
                    setResult(RESULT_OK,intent);
                    FormActivity.this.finish();
                }
            }
        });
    }
}