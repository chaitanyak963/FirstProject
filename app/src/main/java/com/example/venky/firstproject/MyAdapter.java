package com.example.venky.firstproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ADMIN on 1/3/2019.
 */

public class MyAdapter extends
        RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    int[] image;
    String[] names;

    public MyAdapter(MainActivity mainActivity,
                     String[] names,int[] images){
        context = mainActivity;
        image = images;
        this.names = names;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row,
                parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(names[position]);
        holder.photo.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            photo = itemView.findViewById(R.id.image);
        }
    }
}
