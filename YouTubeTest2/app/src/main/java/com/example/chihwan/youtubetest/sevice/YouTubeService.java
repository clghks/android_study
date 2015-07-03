package com.example.chihwan.youtubetest.sevice;

import com.example.chihwan.youtubetest.data.ResponseSearchResult;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by chihwan on 15. 7. 2..
 */
public interface YouTubeService {
    @GET("/search")
    ResponseSearchResult searchResult(@Query("part") String part, @Query("type") String type, @Query("maxResults") String maxResults, @Query("q") String keyword, @Query("key") String apiKey);
}
