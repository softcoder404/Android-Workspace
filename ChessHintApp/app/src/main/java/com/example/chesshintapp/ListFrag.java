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

    public interface ItemSelected{
        void onItemSelected(int index);
    }
    ItemSelected activity;

    public ListFrag() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (ItemSelected)context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String [] data;

        data = getResources().getStringArray(R.array.pieces);

        //to put the list items inside our list fragment will need an adapter
        //setListAdapter(new ArrayAdapter<type>(context,layout_file,data))
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data ));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        activity.onItemSelected(position);
    }
}