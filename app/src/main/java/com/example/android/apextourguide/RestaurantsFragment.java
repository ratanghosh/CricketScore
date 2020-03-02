package com.example.android.apextourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<attractions> attraction = new ArrayList<>();

        attraction.add(new attractions(getString(R.string.restaurants_curry_kitchen_name), getString(R.string.restaurants_curry_kitchen_schedule),
                getString(R.string.restaurants_curry_kitchen_address)));
        attraction.add(new attractions(getString(R.string.restaurants_carmens_cafe_name), getString(R.string.restaurants_carmens_cafe_schedule),
                getString(R.string.restaurants_carmens_cafe_address)));
        attraction.add(new attractions(getString(R.string.restaurants_royal_bengal_name), getString(R.string.restaurants_royal_bengal_schedule),
                getString(R.string.restaurants_royal_bengal_address)));
        attraction.add(new attractions(getString(R.string.restaurants_detroit_masala_name), getString(R.string.restaurants_detroit_masala_schedule),
                getString(R.string.restaurants_detroit_masala_address)));
        attraction.add(new attractions(getString(R.string.restaurants_bombay_kitchen_name), getString(R.string.restaurants_bombay_kitchen_schedule),
                getString(R.string.restaurants_bombay_kitchen_address)));
        attraction.add(new attractions(getString(R.string.restaurants_curry_leaf_name), getString(R.string.restaurants_curry_leaf_schedule),
                getString(R.string.restaurants_curry_leaf_address)));
        attraction.add(new attractions(getString(R.string.restaurants_thai_bistro_name), getString(R.string.restaurants_thai_bistro_schedule),
                getString(R.string.restaurants_thai_bistro_address)));
        attraction.add(new attractions(getString(R.string.restaurants_sree_saffron_name), getString(R.string.restaurants_sree_saffron_schedule),
                getString(R.string.restaurants_sree_saffron_address)));
        attraction.add(new attractions(getString(R.string.restaurants_sultan_name), getString(R.string.restaurants_sultan_schedule),
                getString(R.string.restaurants_sultan_address)));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attraction);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootview;


    }

}