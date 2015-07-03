package com.example.chihwan.youtubetest.data;

import com.google.gson.annotations.Expose;

/**
 * Created by chihwan on 15. 7. 2..
 */
public class High {
    @Expose
    private String url;

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
