package com.example.android.apextourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<attractions> attraction = new ArrayList<>();

        attraction.add(new attractions(getString(R.string.bars_hop_cat_name), getString(R.string.bars_hop_cat_schedule),
                getString(R.string.bars_hop_cat_address)));
        attraction.add(new attractions(getString(R.string.bars_bob_name), getString(R.string.bars_bob_schedule),
                getString(R.string.bars_bob_address)));
        attraction.add(new attractions(getString(R.string.bars_stela_name), getString(R.string.bars_stela_schedule),
                getString(R.string.bars_stela_address)));
        attraction.add(new attractions(getString(R.string.bars_blue_cap_name), getString(R.string.bars_blue_cap_schedule),
                getString(R.string.bars_blue_cap_address)));
        attraction.add(new attractions(getString(R.string.bars_royal_club_name), getString(R.string.bars_royal_club_schedule),
                getString(R.string.bars_royal_club_address)));
        attraction.add(new attractions(getString(R.string.bars_nando_name), getString(R.string.bars_nando_schedule),
                getString(R.string.bars_nando_address)));
        attraction.add(new attractions(getString(R.string.bars_sweet_dream_name), getString(R.string.bars_sweet_dream_schedule),
                getString(R.string.bars_sweet_dream_address)));
        attraction.add(new attractions(getString(R.string.bars_exotica_name), getString(R.string.bars_exotica_schedule),
                getString(R.string.bars_exotica_address)));
        attraction.add(new attractions(getString(R.string.bars_cowboy_name), getString(R.string.bars_cowboy_schedule),
                getString(R.string.bars_cowboy_address)));
        attraction.add(new attractions(getString(R.string.bars_western_lounge_name), getString(R.string.bars_western_lounge_schedule),
                getString(R.string.bars_western_lounge_address)));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attraction);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootview;


    }

}


