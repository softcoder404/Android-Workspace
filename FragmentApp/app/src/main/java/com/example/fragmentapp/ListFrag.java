package com.example.fragmentapp;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.Objects;


public class ListFrag extends ListFragment {

        public  ListFrag(){
        }

        String [] items;
    //create an interface to link this fragment to main activity
    public interface ItemSelected{
        void onItemSelected(int index);
    }

    ItemSelected activity;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //attach our interface with the main activity
        activity = (ItemSelected) context;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        items = getResources().getStringArray(R.array.pieces);
        //To place item on the listView, we need to setArrayAdapter
        setListAdapter(new ArrayAdapter<>(Objects.requireNonNull(getActivity()), android.R.layout.simple_list_item_1,items));

    }

    //we gonna need an inbuilt override method onListClick method to list to selected item from the listFragment


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        activity.onItemSelected(position);
    }
}