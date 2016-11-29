package com.clghks.onboardertest;

import android.util.Log;

import com.jrejaud.onboarder.OnboardingActivity;

/**
 * Created by chihwan on 2016. 11. 29..
 */

public class MyOnboardingActivity extends OnboardingActivity {

    @Override
    public void onOnboardingClick(int position) {
        Log.d("TAG", "Position is: " + position);

        if(position == 2){
            finish();
        }
    }

}
