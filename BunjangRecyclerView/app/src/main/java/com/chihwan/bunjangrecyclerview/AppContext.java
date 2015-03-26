package com.chihwan.bunjangrecyclerview;

import android.app.Application;

/**
 * Created by ChiHwan on 2015. 3. 26..
 */
public class AppContext extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        VolleyConfig.init(this);
    }
}
