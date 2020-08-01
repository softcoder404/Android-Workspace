package com.example.fragmentapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ListFrag extends ListFragment {
  ArrayList<String> items;

        public  ListFrag(){

        }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        items = new ArrayList<String>();
        items.add("1. This is Item One");
        items.add("2. This is Item Two");
        items.add("3. This is Item Three");
        items.add("4. This is Item Four");

        ArrayAdapter

    }

    //we gonna need an inbuilt override method onListClick method to list to selected item from the listFragment


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}