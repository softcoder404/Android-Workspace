package com.example.chesshintapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    ArrayList<PersonModel> people;
    PersonAdapter(Context context, ArrayList<PersonModel> list){
        this.people = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvSurname;
        ImageView ivPref;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvSurname = itemView.findViewById(R.id.tvSurname);
            ivPref = itemView.findViewById(R.id.ivPref);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

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

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
         holder.itemView.setTag(people.get(position));
         holder.tvName.setText(people.get(position).getFirstname());
         holder.tvSurname.setText(people.get(position).getSurname());
         if(people.get(position).getPreference().equals("plane")) holder.ivPref.setImageResource(R.drawable.plane);
         else holder.ivPref.setImageResource(R.drawable.bus);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
