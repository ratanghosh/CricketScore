package com.example.android.apextourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<attractions> {

    public AttractionsAdapter(Activity context, ArrayList<attractions> attraction) {
        super(context, 0, attraction);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link attractions} object located at this position in the list
        attractions currentAttractions = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the  name from the currentAttractions object and
        // set this text on the nameTextView
        nameTextView.setText(currentAttractions.getName());

        // Find the TextView in the list_item.xml layout with the ID schedule_text_view
        TextView scheduleTextView = (TextView) listItemView.findViewById(R.id.schedule_text_view);
        // Get the schedule from the currentAttractions object and
        // set this text on the scheduleTextView
        scheduleTextView.setText(currentAttractions.getSchedule());

        // Find the TextView in the list_item.xml layout with the ID address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address from the currentAttractions object and
        // set this text on the addressName TextView
        addressTextView.setText(currentAttractions.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID photo_image_view
        ImageView photoImageView = (ImageView) listItemView.findViewById(R.id.photo_image_view);
        // Get the address from the currentAttractions object and
        // set this  ImageID in the ImageView

        if (currentAttractions.hasImage()) {
            photoImageView.setImageResource(currentAttractions.getImageResourceID());
            photoImageView.setVisibility(View.VISIBLE);
        } else {
            photoImageView.setVisibility(View.GONE);
        }


        return listItemView;
    }

}
