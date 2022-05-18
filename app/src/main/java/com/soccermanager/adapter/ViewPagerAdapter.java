package com.soccermanager.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.soccermanager.fragment.FragmentCup;
import com.soccermanager.fragment.FragmentFollowing;
import com.soccermanager.fragment.FragmentMatches;
import com.soccermanager.fragment.FragmentMore;
import com.soccermanager.fragment.FragmentNews;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentMatches();
            case 1: return new FragmentNews();
            case 2: return new FragmentCup();
            case 3: return new FragmentFollowing();
            case 4: return new FragmentMore();
            default: return new FragmentMatches();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
