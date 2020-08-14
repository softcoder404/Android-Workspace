package com.example.chesshintapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    TextView tvDescription;
    String [] descriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDescription = findViewById(R.id.tvDescription);
        tvDescription.setVisibility(View.GONE);
        descriptions = getResources().getStringArray(R.array.descriptions);
        //if the phone is in portrait
        if(findViewById(R.id.layout_portrait) != null){
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .hide(fragmentManager.findFragmentById(R.id.detailFrag))
                    .show(fragmentManager.findFragmentById(R.id.listFrag))
                    .commit();
        }
        //if the phone is in landscape

        if(findViewById(R.id.layout_landscape) != null){
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .show(fragmentManager.findFragmentById(R.id.detailFrag))
                    .show(fragmentManager.findFragmentById(R.id.listFrag))
                    .commit();
        }
    }

    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(descriptions[index]);
        tvDescription.setVisibility(View.VISIBLE);
        //if the phone is in portrait
        if(findViewById(R.id.layout_portrait) != null){
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .show(fragmentManager.findFragmentById(R.id.detailFrag))
                    .hide(fragmentManager.findFragmentById(R.id.listFrag))
                    .addToBackStack(null)
                    .commit();
        }
    }
}