package com.clghks.designsupport.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clghks.designsupport.R;
import com.clghks.designsupport.adapter.TabPagerAdapter;

/**
 * Created by chihwan on 15. 8. 17..
 */
public class TabsFragment extends android.support.v4.app.Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabs, container, false);

        tabLayout = (TabLayout)rootView.findViewById(R.id.tabLayout);
        viewPager = (ViewPager)rootView.findViewById(R.id.viewPager);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TabPagerAdapter adapter = new TabPagerAdapter(getFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(adapter);
    }
}
