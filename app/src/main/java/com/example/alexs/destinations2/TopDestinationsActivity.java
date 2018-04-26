package com.example.alexs.destinations2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopDestinationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destinations_list);

        TopDestinations topDestinations = new TopDestinations();
        ArrayList<Destination> list = topDestinations.getList();

        TopDestinationsAdapter destinationAdapter = new TopDestinationsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.listID);
        listView.setAdapter(destinationAdapter);
    }

    public void onListItemClick(View listItem) {
        Destination destination = (Destination) listItem.getTag();
        Log.d("Destination Name: ", destination.getName());

        Intent intent = new Intent(this, DestinationActivity.class);
        intent.putExtra("destination", destination);
        startActivity(intent);
    }
}
