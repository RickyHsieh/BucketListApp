package com.purplestudio.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.purplestudio.bucketlistapp.R;
import com.purplestudio.bucketlistapp.adapter.ThingsAdapter;
import com.purplestudio.bucketlistapp.pojo.Thing;

public class ThingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thing);

        RecyclerView thingsList = findViewById(R.id.recycler_view_thing);

        Thing[] things = {
                new Thing("Skydiving", "Experience the thrill of jumping out of a plane", R.drawable.img1),
                new Thing("Northern Lights", "Witness the spectacular Aurora Borealis", R.drawable.img2),
                new Thing("Safari", "Explore the African savannah and see wild animals", R.drawable.img3),
                new Thing("Great Barrier Reef", "Dive or snorkel in the world's largest coral reef system",  R.drawable.img4),
                new Thing("Mount Everest Base Camp", "Trek to the base of the world's highest mountain", R.drawable.img5)
        };
        ThingsAdapter ta = new ThingsAdapter(things);
        thingsList.setAdapter(ta);
    }
}