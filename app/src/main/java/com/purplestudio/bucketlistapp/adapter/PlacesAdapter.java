package com.purplestudio.bucketlistapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.purplestudio.bucketlistapp.R;
import com.purplestudio.bucketlistapp.pojo.Place;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder> {

    private Place[] places;

    public PlacesAdapter(Place[] places) {
        this.places = places;
    }

    @NonNull
    @Override
    public PlacesAdapter.PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place_layout, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.bind(places[position]);
    }

    @Override
    public int getItemCount() {
        return places.length;
    }

    static class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        RatingBar appRating;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.card_view_place_img);
            appTitle = itemView.findViewById(R.id.card_view_place_title);
            appDescription = itemView.findViewById(R.id.card_view_place_desc);
            appRating = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(Place thing) {
            appTitle.setText(thing.getName());
            appDescription.setText(thing.getDescription());
            appImage.setImageResource(thing.getImg());
            appRating.setRating(thing.getDecimalValue());
        }
    }
}
