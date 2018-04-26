package com.example.alexs.destinations2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        Intent intent = getIntent();
        Destination destination = (Destination)intent.getSerializableExtra("destination");
        Log.d("DestinationActivity: ", destination.getName());
    }
}
