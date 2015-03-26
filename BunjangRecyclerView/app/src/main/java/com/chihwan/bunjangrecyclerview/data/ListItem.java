package com.chihwan.bunjangrecyclerview.data;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Created by ChiHwan on 2015. 3. 26..
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "ad_products",
        "hot_products"
})
public class ListItem {
    @JsonProperty("ad_products")
    private java.util.List<HotProduct> adProducts = new ArrayList<HotProduct>();
    @JsonProperty("hot_products")
    private java.util.List<HotProduct> hotProducts = new ArrayList<HotProduct>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The adProducts
     */
    @JsonProperty("ad_products")
    public java.util.List<HotProduct> getAdProducts() {
        return adProducts;
    }

    /**
     *
     * @param adProducts
     * The ad_products
     */
    @JsonProperty("ad_products")
    public void setAdProducts(java.util.List<HotProduct> adProducts) {
        this.adProducts = adProducts;
    }

    /**
     *
     * @return
     * The hotProducts
     */
    @JsonProperty("hot_products")
    public java.util.List<HotProduct> getHotProducts() {
        return hotProducts;
    }

    /**
     *
     * @param hotProducts
     * The hot_products
     */
    @JsonProperty("hot_products")
    public void setHotProducts(java.util.List<HotProduct> hotProducts) {
        this.hotProducts = hotProducts;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
