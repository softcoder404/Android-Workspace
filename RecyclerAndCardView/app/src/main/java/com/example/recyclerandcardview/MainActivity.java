package com.example.recyclerandcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ClickedItem {
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<PersonModel> person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        person = new ArrayList<PersonModel>();
        person.add(new PersonModel("AbdulHameed","Quadri","plane"));
        person.add(new PersonModel("Olamilekan","Jimoh","plane"));
        person.add(new PersonModel("Adam","AbdulHakeem","plane"));
        person.add(new PersonModel("Stark","Azeez","plane"));
        person.add(new PersonModel("Tom","Cruise","bus"));
        person.add(new PersonModel("Jeremy","Blum","bus"));
        person.add(new PersonModel("Angela","Yu","plane"));
        person.add(new PersonModel("Traversy","Scott","bus"));
        person.add(new PersonModel("Allen","John","plane"));
        person.add(new PersonModel("AbdulHameed","Quadri","plane"));
        person.add(new PersonModel("Olamilekan","Jimoh","plane"));
        person.add(new PersonModel("Adam","AbdulHakeem","plane"));
        person.add(new PersonModel("Stark","Azeez","plane"));
        person.add(new PersonModel("Tom","Cruise","bus"));
        person.add(new PersonModel("Jeremy","Blum","bus"));
        person.add(new PersonModel("Angela","Yu","plane"));
        person.add(new PersonModel("Traversy","Scott","bus"));
        person.add(new PersonModel("Allen","John","plane"));
        person.add(new PersonModel("AbdulHameed","Quadri","plane"));
        person.add(new PersonModel("Olamilekan","Jimoh","plane"));
        person.add(new PersonModel("Adam","AbdulHakeem","plane"));
        person.add(new PersonModel("Stark","Azeez","plane"));
        person.add(new PersonModel("Tom","Cruise","bus"));
        person.add(new PersonModel("Jeremy","Blum","bus"));
        person.add(new PersonModel("Angela","Yu","plane"));
        person.add(new PersonModel("Traversy","Scott","bus"));
        person.add(new PersonModel("Allen","John","plane"));

        recyclerAdapter = new PersonAdapter(this,person);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void onClickedItem(int index) {
        Log.d("Clicked detected","" + person.get(index).getName());
    }
}