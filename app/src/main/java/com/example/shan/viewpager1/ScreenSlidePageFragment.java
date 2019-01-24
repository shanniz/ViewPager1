package com.example.shan.viewpager1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ScreenSlidePageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        TextView tvPage = (TextView)rootView.findViewById(R.id.tvPageNumber);
        TextView tvMovie = (TextView)rootView.findViewById(R.id.tvMovieName);
        int pageNum = getArguments().getInt("position");
        String movie = getArguments().getString("movie");
        tvPage.setText(  "Page: "+Integer.toString(pageNum));
        tvMovie.setText(  "Movie Name: "+ movie);
        return rootView;
    }

}
