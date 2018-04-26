package com.example.alexs.destinations2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopDestinationsAdapter extends ArrayAdapter<Destination> {

    public TopDestinationsAdapter(Context context, ArrayList<Destination> destinations) {
        super(context, 0, destinations);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.destinations_item, parent, false);
        }
        Destination currentDestination = getItem(position);

        TextView destinationName = (TextView) listItemView.findViewById(R.id.destinationNameTextViewID);
        destinationName.setText(currentDestination.getName().toString());

        listItemView.setTag(currentDestination);

        return listItemView;
    }

}
