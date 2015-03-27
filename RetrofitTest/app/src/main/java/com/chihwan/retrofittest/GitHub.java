package com.chihwan.retrofittest;

import com.chihwan.retrofittest.data.GithubUser;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by ChiHwan on 2015. 3. 27..
 */
public interface GitHub {
    @GET("/users/{id}")
    GithubUser getUser(@Path("id") String id);

    @GET("/users/{id}/followers")
    List getFollowers(@Path("id") String id);

    @GET("/users/{id}/following")
    List getFollowing(@Path("id")String id);
}
