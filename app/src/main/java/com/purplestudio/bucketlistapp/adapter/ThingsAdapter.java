package com.purplestudio.bucketlistapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.purplestudio.bucketlistapp.R;
import com.purplestudio.bucketlistapp.pojo.Thing;

public class ThingsAdapter extends RecyclerView.Adapter<ThingsAdapter.ThingViewHolder> {

    private Thing[] things;

    public ThingsAdapter(Thing[] things) {
        this.things = things;
    }

    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thing_layout, parent, false);
        return new ThingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {
        holder.bind(things[position]);
    }

    @Override
    public int getItemCount() {
        return things.length;
    }

    static class ThingViewHolder extends RecyclerView.ViewHolder {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public ThingViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.card_view_thing_img);
            appTitle = itemView.findViewById(R.id.card_view_thing_title);
            appDescription = itemView.findViewById(R.id.card_view_thing_desc);
        }

        public void bind(Thing thing) {
            appTitle.setText(thing.getName());
            appDescription.setText(thing.getDescription());
            appImage.setImageResource(thing.getImg());
        }
    }
}
