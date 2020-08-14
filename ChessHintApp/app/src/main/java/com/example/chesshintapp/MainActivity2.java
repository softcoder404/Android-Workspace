package com.example.chesshintapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<PersonModel> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.listRV);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(MainActivity2.this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<PersonModel>();
        people.add(new PersonModel("AbdulHameed","Quadri","plane"));
        people.add(new PersonModel("AbdulHakeem","Adam","bus"));
        people.add(new PersonModel("AbdulGaffar","Asipita","plane"));
        people.add(new PersonModel("Olamilekan","Jimoh","plane"));
        people.add(new PersonModel("Oluwaremilekun","Jimoh","bus"));
        people.add(new PersonModel("John","Snow","bus"));
        people.add(new PersonModel("Tom","Cruise","bus"));
        people.add(new PersonModel("Jeremy","Blum","plane"));
        people.add(new PersonModel("Traversy","Media","plane"));
        people.add(new PersonModel("Angela","Yu","plane"));
        people.add(new PersonModel("AbdulHameed","Quadri","plane"));
        people.add(new PersonModel("AbdulHakeem","Adam","bus"));
        people.add(new PersonModel("AbdulGaffar","Asipita","plane"));
        people.add(new PersonModel("Olamilekan","Jimoh","plane"));
        people.add(new PersonModel("Oluwaremilekun","Jimoh","bus"));
        people.add(new PersonModel("John","Snow","bus"));
        people.add(new PersonModel("Tom","Cruise","bus"));
        people.add(new PersonModel("Jeremy","Blum","plane"));
        people.add(new PersonModel("Traversy","Media","plane"));
        people.add(new PersonModel("Angela","Yu","plane"));

        myAdapter = new PersonAdapter(MainActivity2.this,people);

        recyclerView.setAdapter(myAdapter);
    }
}