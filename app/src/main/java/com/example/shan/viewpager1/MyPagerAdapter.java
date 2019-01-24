package com.example.shan.viewpager1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//A simple pager adapter that represents different ScreenSlidePageFragment objects
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    private String[] pageItems;
    public MyPagerAdapter(FragmentManager fm, String[] pageItems) {
        super(fm);
        this.pageItems = pageItems;
    }

    @Override
    public Fragment getItem(int position) {
        ScreenSlidePageFragment screenSlidePageFragment = new ScreenSlidePageFragment();

        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putString("movie", pageItems[position]);
        screenSlidePageFragment.setArguments(args);

        return screenSlidePageFragment;
    }

    @Override
    public int getCount() {
        return pageItems.length;
    }
}
