package com.example.chihwan.youtubetest.config;

import com.google.gson.Gson;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by chihwan on 15. 7. 2..
 */
public class RetrofitConfig {
    private static RetrofitConfig instance;
    private static RestAdapter restAdapter;

    private RetrofitConfig(){
        restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://www.googleapis.com/youtube/v3")
                .setConverter(new GsonConverter(new Gson()))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

    }

    public static RetrofitConfig getInstance(){
        if(instance == null){
            instance = new RetrofitConfig();
        }
        return instance;
    }

    public <T> T create(Class<T> service){
        return restAdapter.create(service);
    }
}
