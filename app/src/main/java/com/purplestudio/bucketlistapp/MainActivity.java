package com.purplestudio.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.purplestudio.bucketlistapp.adapter.PlacesAdapter;
import com.purplestudio.bucketlistapp.adapter.ThingsAdapter;
import com.purplestudio.bucketlistapp.pojo.Place;
import com.purplestudio.bucketlistapp.pojo.Thing;

public class MainActivity extends AppCompatActivity {

    private Button btnPlace;
    private Button btnThing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlace = findViewById(R.id.btn_place_to_go);
        btnThing = findViewById(R.id.btn_thing_to_do);


        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placeActivityIntent = new Intent(MainActivity.this, PlaceActivity.class);
                startActivity(placeActivityIntent);
            }
        });

        btnThing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingActivityIntent = new Intent(MainActivity.this, ThingActivity.class);
                startActivity(thingActivityIntent);
            }
        });

    }
}