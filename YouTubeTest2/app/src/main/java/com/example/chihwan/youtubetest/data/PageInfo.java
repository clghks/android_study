package com.example.chihwan.youtubetest.data;

import com.google.gson.annotations.Expose;

/**
 * Created by chihwan on 15. 7. 2..
 */
public class PageInfo {
    @Expose
    private Integer totalResults;
    @Expose
    private Integer resultsPerPage;

    /**
     * @return The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @param totalResults The totalResults
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * @return The resultsPerPage
     */
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    /**
     * @param resultsPerPage The resultsPerPage
     */
    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }
}
