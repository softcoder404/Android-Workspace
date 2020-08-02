package com.example.recyclerandcardview;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<PersonModel> people;
    ClickedItem activity;

    public PersonAdapter(Context context, ArrayList<PersonModel> p) {
        this.people = p;
        this.activity = (ClickedItem) context;
    }

    public interface ClickedItem{
        void onClickedItem(int index);
    }


    //create a public class of ViewHolder that will implement all the activities
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgPref;
        private  TextView tvName, tvSurname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgPref = itemView.findViewById(R.id.imgPref);
            this.tvName = itemView.findViewById(R.id.tvName);
            this.tvSurname = itemView.findViewById(R.id.tvSurname);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onClickedItem(people.indexOf(view.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(this.people.get(position));
        holder.tvName.setText(this.people.get(position).getName());
        holder.tvSurname.setText(this.people.get(position).getSurname());
        if(this.people.get(position).getPref() == "bus"){
            holder.imgPref.setImageResource(R.drawable.bus);
        }else{
            holder.imgPref.setImageResource(R.drawable.flight);
        }
    }

    @Override
    public int getItemCount() {
        return this.people.size();
    }
}
