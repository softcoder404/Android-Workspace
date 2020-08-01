package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    TextView tvDetail;
    String [] details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        details = getResources().getStringArray(R.array.descriptions);
        tvDetail = findViewById(R.id.tvDetail);
        tvDetail.setText(details[0]);
        //phone in landscape
        if(findViewById(R.id.layout_land) != null){
            FragmentManager manager =  this.getSupportFragmentManager();

            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.listFrag))
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .commit();
        }
        //phone is in portrait
        if(findViewById(R.id.layout_portrait) != null){
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.listFrag))
                    .hide(manager.findFragmentById(R.id.detailFrag))
                    .addToBackStack(null)
                    .commit();
        }

    }

    @Override
    public void onItemSelected(int index) {
        tvDetail.setText(details[index]);
    }
}