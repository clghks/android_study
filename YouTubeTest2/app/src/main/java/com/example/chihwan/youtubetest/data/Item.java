package com.example.chihwan.youtubetest.data;

import com.google.gson.annotations.Expose;

/**
 * Created by chihwan on 15. 7. 2..
 */
public class Item {
    @Expose
    private String kind;
    @Expose
    private String etag;
    @Expose
    private Id id;
    @Expose
    private Snippet snippet;

    /**
     * @return The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * @return The etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * @param etag The etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * @return The id
     */
    public Id getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /**
     * @return The snippet
     */
    public Snippet getSnippet() {
        return snippet;
    }

    /**
     * @param snippet The snippet
     */
    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }
}
