package com.example.android.apextourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<attractions> attraction = new ArrayList<>();

        attraction.add(new attractions(getString(R.string.beach_grand_haven_name), getString(R.string.beach_grand_haven_schedule),
                getString(R.string.beach_grand_haven_address), R.drawable.grand_haven_beach));
        attraction.add(new attractions(getString(R.string.beach_bear_dune_name), getString(R.string.beach_bear_dune_schedule),
                getString(R.string.beach_bear_dune_address), R.drawable.bear_dune_beach));
        attraction.add(new attractions(getString(R.string.beach_copper_harbor_name), getString(R.string.beach_copper_harbor_schedule),
                getString(R.string.beach_copper_harbor_address), R.drawable.copper_harbor_beach));
        attraction.add(new attractions(getString(R.string.beach_empire_beach_name), getString(R.string.beach_empire_beach_schedule),
                getString(R.string.beach_empire_beach_address), R.drawable.empire_beach));
        attraction.add(new attractions(getString(R.string.beach_north_manitou_name), getString(R.string.beach_north_manitou_schedule),
                getString(R.string.beach_north_manitou_address), R.drawable.north_manitou_beach));
        attraction.add(new attractions(getString(R.string.beach_orchard_beach_name), getString(R.string.beach_orchard_beach_schedule),
                getString(R.string.beach_orchard_beach_address), R.drawable.orchard_beach));
        attraction.add(new attractions(getString(R.string.beach_rogers_city_name), getString(R.string.beach_rogers_city_schedule),
                getString(R.string.beach_rogers_city_address), R.drawable.rogers_city_beach));
        attraction.add(new attractions(getString(R.string.beach_silver_lake_name), getString(R.string.beach_silver_lake_schedule),
                getString(R.string.beach_silver_lake_address), R.drawable.silver_lake_beach));
        attraction.add(new attractions(getString(R.string.beach_south_park_name), getString(R.string.beach_south_park_schedule),
                getString(R.string.beach_south_park_address), R.drawable.south_park_beach));
        attraction.add(new attractions(getString(R.string.beach_tiscornia_beach_name), getString(R.string.beach_tiscornia_beach_schedule),
                getString(R.string.beach_tiscornia_beach_address), R.drawable.tiscornia_beach));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attraction);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootview;


    }

}