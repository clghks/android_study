package com.clghks.designsupport.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.clghks.designsupport.fragment.CurrentFragment;

/**
 * Created by chihwan on 15. 8. 17..
 */
public class TabPagerAdapter extends FragmentPagerAdapter {
    private final int TAB_COUNT = 10;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return CurrentFragment.CurrentFragment(position);
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "TAB " + position;
    }
}
