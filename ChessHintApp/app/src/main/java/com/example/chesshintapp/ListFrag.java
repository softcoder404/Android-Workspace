package com.example.chesshintapp;

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



    public ListFrag() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<String> data = new ArrayList<String>();
        data.add("1. This is item 1");
        data.add("2. This is item 2");
        data.add("3. This is item 3");
        data.add("4. This is item 4");

        //to put the list items inside our list fragment will need an adapter
        //setListAdapter(new ArrayAdapter<type>(context,layout_file,data))
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data ));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {

    }
}