package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    TextView tvDetail;
    ArrayList<String> details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        details = new ArrayList<String>();
        details.add("Description for Item One");
        details.add("Description for Item Two");
        details.add("Description for Item Three");
        details.add("Description for Item Four");
        tvDetail = findViewById(R.id.tvDetail);
        tvDetail.setText(details.get(0));
    }

    @Override
    public void onItemSelected(int index) {
        tvDetail.setText(details.get(index));
    }
}