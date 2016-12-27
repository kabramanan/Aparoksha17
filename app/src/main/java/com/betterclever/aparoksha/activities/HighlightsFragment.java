package com.betterclever.aparoksha.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.betterclever.aparoksha.R;


public class HighlightsFragment extends Fragment {


    public HighlightsFragment() {

    }

    public static HighlightsFragment newInstance() {

        Bundle args = new Bundle();

        HighlightsFragment fragment = new HighlightsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_highlights, container, false);
    }

}
