package com.purplestudio.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.purplestudio.bucketlistapp.adapter.PlacesAdapter;
import com.purplestudio.bucketlistapp.pojo.Place;

public class PlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        RecyclerView placesList = findViewById(R.id.recycler_view_place);

        Place[] places = {
                new Place("Paris", "The city of love, perfect for romantic walks and candlelit dinners,Enjoy a sunset cruise on the Seine River", R.drawable.img1,3),
                new Place("Italy", "Filled with romance, from Tuscany to Rome, Take a gondola ride through the canals of Venice", R.drawable.img2,4.5f),
                new Place("Brazil", "Vibrant culture and breathtaking landscapes, visit the Christ the Redeemer statue in Rio de Janeiro", R.drawable.img3,5),
                new Place("United States", "Diverse landscapes and iconic landmarks, Walk the Golden Gate Bridge in San Francisco", R.drawable.img4,2.5f),
                new Place("Taiwan", "Rich in tradition and modern marvels,Explore the night markets in Taipei", R.drawable.img5,1.5f)
        };

        PlacesAdapter pa = new PlacesAdapter(places);
        placesList.setAdapter(pa);
    }
}