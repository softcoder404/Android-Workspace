package com.example.chesshintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    TextView tvDescription;
    ArrayList<String> descriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDescription = findViewById(R.id.tvDescription);
        tvDescription.setVisibility(View.GONE);
        descriptions = new ArrayList<String>();
        descriptions.add("Item one is clicked");
        descriptions.add("Item two is clicked");
        descriptions.add("Item three is clicked");
        descriptions.add("Item four is clicked");
    }

    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(descriptions.get(index));
        tvDescription.setVisibility(View.VISIBLE);
    }
}