package com.example.android.apextourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<attractions> attraction = new ArrayList<>();

        attraction.add(new attractions(getString(R.string.park_rosa_park_name), getString(R.string.park_rosa_park_schedule),
                getString(R.string.park_rosa_park_address)));
        attraction.add(new attractions(getString(R.string.park_fish_ladder_name), getString(R.string.park_fish_ladder_schedule),
                getString(R.string.park_fish_ladder_address)));
        attraction.add(new attractions(getString(R.string.park_river_side_name), getString(R.string.park_river_side_schedule),
                getString(R.string.park_river_side_address)));
        attraction.add(new attractions(getString(R.string.park_meijer_garden_name), getString(R.string.park_meijer_garden_schedule),
                getString(R.string.park_meijer_garden_address)));
        attraction.add(new attractions(getString(R.string.park_cascade_park_name), getString(R.string.park_cascade_park_schedule),
                getString(R.string.park_cascade_park_address)));
        attraction.add(new attractions(getString(R.string.park_huff_park_name), getString(R.string.park_huff_park_schedule),
                getString(R.string.park_huff_park_address)));
        attraction.add(new attractions(getString(R.string.park_aberdeen_park_name), getString(R.string.park_aberdeen_park_schedule),
                getString(R.string.park_aberdeen_park_address)));
        attraction.add(new attractions(getString(R.string.park_jr_ford_name), getString(R.string.park_jr_ford_schedule),
                getString(R.string.park_jr_ford_address)));
        attraction.add(new attractions(getString(R.string.park_pere_martin_name), getString(R.string.park_pere_martin_schedule),
                getString(R.string.park_pere_martin_address)));
        attraction.add(new attractions(getString(R.string.park_grand_valley_name), getString(R.string.park_grand_valley_schedule),
                getString(R.string.park_grand_valley_address)));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(),attraction);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootview;



    }

}