package com.chihwan.bunjangrecyclerview.data;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Created by ChiHwan on 2015. 3. 26..
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "ad",
        "biz_type",
        "bizseller",
        "category1",
        "category2",
        "category_id",
        "checkout",
        "comment",
        "description",
        "device",
        "distance",
        "exchg",
        "favorite",
        "following",
        "image_count",
        "image_source",
        "interest",
        "ipay",
        "is_identification",
        "item_count",
        "item_img_url",
        "item_price_sum",
        "join_date",
        "katalk",
        "latitude",
        "location",
        "longitude",
        "name",
        "phone",
        "pid",
        "price",
        "price_status",
        "product_image",
        "profile_image",
        "profile_image_cnt",
        "qty",
        "rank_type",
        "shop_img_url",
        "status",
        "style",
        "supporter_grade",
        "taekpo",
        "tags",
        "target",
        "time",
        "uid",
        "updatable",
        "update_time",
        "used",
        "user_comment_count",
        "user_description",
        "user_favorite_count",
        "user_grade",
        "user_interest",
        "user_name",
        "user_review_count"
})
public class HotProduct {
    @JsonProperty("ad")
    private String ad;
    @JsonProperty("biz_type")
    private Integer bizType;
    @JsonProperty("bizseller")
    private Integer bizseller;
    @JsonProperty("category1")
    private String category1;
    @JsonProperty("category2")
    private String category2;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("checkout")
    private Integer checkout;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("description")
    private String description;
    @JsonProperty("device")
    private String device;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("exchg")
    private String exchg;
    @JsonProperty("favorite")
    private String favorite;
    @JsonProperty("following")
    private Integer following;
    @JsonProperty("image_count")
    private String imageCount;
    @JsonProperty("image_source")
    private String imageSource;
    @JsonProperty("interest")
    private String interest;
    @JsonProperty("ipay")
    private String ipay;
    @JsonProperty("is_identification")
    private Integer isIdentification;
    @JsonProperty("item_count")
    private Integer itemCount;
    @JsonProperty("item_img_url")
    private String itemImgUrl;
    @JsonProperty("item_price_sum")
    private Integer itemPriceSum;
    @JsonProperty("join_date")
    private String joinDate;
    @JsonProperty("katalk")
    private String katalk;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("location")
    private String location;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("pid")
    private String pid;
    @JsonProperty("price")
    private String price;
    @JsonProperty("price_status")
    private String priceStatus;
    @JsonProperty("product_image")
    private List<ProductImage> productImage = new ArrayList<ProductImage>();
    @JsonProperty("profile_image")
    private List<ProfileImage> profileImage = new ArrayList<ProfileImage>();
    @JsonProperty("profile_image_cnt")
    private Integer profileImageCnt;
    @JsonProperty("qty")
    private String qty;
    @JsonProperty("rank_type")
    private String rankType;
    @JsonProperty("shop_img_url")
    private String shopImgUrl;
    @JsonProperty("status")
    private String status;
    @JsonProperty("style")
    private String style;
    @JsonProperty("supporter_grade")
    private Integer supporterGrade;
    @JsonProperty("taekpo")
    private String taekpo;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("target")
    private String target;
    @JsonProperty("time")
    private String time;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("updatable")
    private String updatable;
    @JsonProperty("update_time")
    private String updateTime;
    @JsonProperty("used")
    private String used;
    @JsonProperty("user_comment_count")
    private Integer userCommentCount;
    @JsonProperty("user_description")
    private String userDescription;
    @JsonProperty("user_favorite_count")
    private Integer userFavoriteCount;
    @JsonProperty("user_grade")
    private Integer userGrade;
    @JsonProperty("user_interest")
    private Integer userInterest;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("user_review_count")
    private Integer userReviewCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The ad
     */
    @JsonProperty("ad")
    public String getAd() {
        return ad;
    }

    /**
     *
     * @param ad
     * The ad
     */
    @JsonProperty("ad")
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     *
     * @return
     * The bizType
     */
    @JsonProperty("biz_type")
    public Integer getBizType() {
        return bizType;
    }

    /**
     *
     * @param bizType
     * The biz_type
     */
    @JsonProperty("biz_type")
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    /**
     *
     * @return
     * The bizseller
     */
    @JsonProperty("bizseller")
    public Integer getBizseller() {
        return bizseller;
    }

    /**
     *
     * @param bizseller
     * The bizseller
     */
    @JsonProperty("bizseller")
    public void setBizseller(Integer bizseller) {
        this.bizseller = bizseller;
    }

    /**
     *
     * @return
     * The category1
     */
    @JsonProperty("category1")
    public String getCategory1() {
        return category1;
    }

    /**
     *
     * @param category1
     * The category1
     */
    @JsonProperty("category1")
    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    /**
     *
     * @return
     * The category2
     */
    @JsonProperty("category2")
    public String getCategory2() {
        return category2;
    }

    /**
     *
     * @param category2
     * The category2
     */
    @JsonProperty("category2")
    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    /**
     *
     * @return
     * The categoryId
     */
    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    /**
     *
     * @param categoryId
     * The category_id
     */
    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     *
     * @return
     * The checkout
     */
    @JsonProperty("checkout")
    public Integer getCheckout() {
        return checkout;
    }

    /**
     *
     * @param checkout
     * The checkout
     */
    @JsonProperty("checkout")
    public void setCheckout(Integer checkout) {
        this.checkout = checkout;
    }

    /**
     *
     * @return
     * The comment
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The device
     */
    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    /**
     *
     * @param device
     * The device
     */
    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     *
     * @return
     * The distance
     */
    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    /**
     *
     * @param distance
     * The distance
     */
    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     *
     * @return
     * The exchg
     */
    @JsonProperty("exchg")
    public String getExchg() {
        return exchg;
    }

    /**
     *
     * @param exchg
     * The exchg
     */
    @JsonProperty("exchg")
    public void setExchg(String exchg) {
        this.exchg = exchg;
    }

    /**
     *
     * @return
     * The favorite
     */
    @JsonProperty("favorite")
    public String getFavorite() {
        return favorite;
    }

    /**
     *
     * @param favorite
     * The favorite
     */
    @JsonProperty("favorite")
    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    /**
     *
     * @return
     * The following
     */
    @JsonProperty("following")
    public Integer getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     * The following
     */
    @JsonProperty("following")
    public void setFollowing(Integer following) {
        this.following = following;
    }

    /**
     *
     * @return
     * The imageCount
     */
    @JsonProperty("image_count")
    public String getImageCount() {
        return imageCount;
    }

    /**
     *
     * @param imageCount
     * The image_count
     */
    @JsonProperty("image_count")
    public void setImageCount(String imageCount) {
        this.imageCount = imageCount;
    }

    /**
     *
     * @return
     * The imageSource
     */
    @JsonProperty("image_source")
    public String getImageSource() {
        return imageSource;
    }

    /**
     *
     * @param imageSource
     * The image_source
     */
    @JsonProperty("image_source")
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    /**
     *
     * @return
     * The interest
     */
    @JsonProperty("interest")
    public String getInterest() {
        return interest;
    }

    /**
     *
     * @param interest
     * The interest
     */
    @JsonProperty("interest")
    public void setInterest(String interest) {
        this.interest = interest;
    }

    /**
     *
     * @return
     * The ipay
     */
    @JsonProperty("ipay")
    public String getIpay() {
        return ipay;
    }

    /**
     *
     * @param ipay
     * The ipay
     */
    @JsonProperty("ipay")
    public void setIpay(String ipay) {
        this.ipay = ipay;
    }

    /**
     *
     * @return
     * The isIdentification
     */
    @JsonProperty("is_identification")
    public Integer getIsIdentification() {
        return isIdentification;
    }

    /**
     *
     * @param isIdentification
     * The is_identification
     */
    @JsonProperty("is_identification")
    public void setIsIdentification(Integer isIdentification) {
        this.isIdentification = isIdentification;
    }

    /**
     *
     * @return
     * The itemCount
     */
    @JsonProperty("item_count")
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     *
     * @param itemCount
     * The item_count
     */
    @JsonProperty("item_count")
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     *
     * @return
     * The itemImgUrl
     */
    @JsonProperty("item_img_url")
    public String getItemImgUrl() {
        return itemImgUrl;
    }

    /**
     *
     * @param itemImgUrl
     * The item_img_url
     */
    @JsonProperty("item_img_url")
    public void setItemImgUrl(String itemImgUrl) {
        this.itemImgUrl = itemImgUrl;
    }

    /**
     *
     * @return
     * The itemPriceSum
     */
    @JsonProperty("item_price_sum")
    public Integer getItemPriceSum() {
        return itemPriceSum;
    }

    /**
     *
     * @param itemPriceSum
     * The item_price_sum
     */
    @JsonProperty("item_price_sum")
    public void setItemPriceSum(Integer itemPriceSum) {
        this.itemPriceSum = itemPriceSum;
    }

    /**
     *
     * @return
     * The joinDate
     */
    @JsonProperty("join_date")
    public String getJoinDate() {
        return joinDate;
    }

    /**
     *
     * @param joinDate
     * The join_date
     */
    @JsonProperty("join_date")
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    /**
     *
     * @return
     * The katalk
     */
    @JsonProperty("katalk")
    public String getKatalk() {
        return katalk;
    }

    /**
     *
     * @param katalk
     * The katalk
     */
    @JsonProperty("katalk")
    public void setKatalk(String katalk) {
        this.katalk = katalk;
    }

    /**
     *
     * @return
     * The latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The longitude
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     * The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     * The pid
     */
    @JsonProperty("pid")
    public String getPid() {
        return pid;
    }

    /**
     *
     * @param pid
     * The pid
     */
    @JsonProperty("pid")
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     *
     * @return
     * The price
     */
    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The priceStatus
     */
    @JsonProperty("price_status")
    public String getPriceStatus() {
        return priceStatus;
    }

    /**
     *
     * @param priceStatus
     * The price_status
     */
    @JsonProperty("price_status")
    public void setPriceStatus(String priceStatus) {
        this.priceStatus = priceStatus;
    }

    /**
     *
     * @return
     * The productImage
     */
    @JsonProperty("product_image")
    public List<ProductImage> getProductImage() {
        return productImage;
    }

    /**
     *
     * @param productImage
     * The product_image
     */
    @JsonProperty("product_image")
    public void setProductImage(List<ProductImage> productImage) {
        this.productImage = productImage;
    }

    /**
     *
     * @return
     * The profileImage
     */
    @JsonProperty("profile_image")
    public List<ProfileImage> getProfileImage() {
        return profileImage;
    }

    /**
     *
     * @param profileImage
     * The profile_image
     */
    @JsonProperty("profile_image")
    public void setProfileImage(List<ProfileImage> profileImage) {
        this.profileImage = profileImage;
    }

    /**
     *
     * @return
     * The profileImageCnt
     */
    @JsonProperty("profile_image_cnt")
    public Integer getProfileImageCnt() {
        return profileImageCnt;
    }

    /**
     *
     * @param profileImageCnt
     * The profile_image_cnt
     */
    @JsonProperty("profile_image_cnt")
    public void setProfileImageCnt(Integer profileImageCnt) {
        this.profileImageCnt = profileImageCnt;
    }

    /**
     *
     * @return
     * The qty
     */
    @JsonProperty("qty")
    public String getQty() {
        return qty;
    }

    /**
     *
     * @param qty
     * The qty
     */
    @JsonProperty("qty")
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     *
     * @return
     * The rankType
     */
    @JsonProperty("rank_type")
    public String getRankType() {
        return rankType;
    }

    /**
     *
     * @param rankType
     * The rank_type
     */
    @JsonProperty("rank_type")
    public void setRankType(String rankType) {
        this.rankType = rankType;
    }

    /**
     *
     * @return
     * The shopImgUrl
     */
    @JsonProperty("shop_img_url")
    public String getShopImgUrl() {
        return shopImgUrl;
    }

    /**
     *
     * @param shopImgUrl
     * The shop_img_url
     */
    @JsonProperty("shop_img_url")
    public void setShopImgUrl(String shopImgUrl) {
        this.shopImgUrl = shopImgUrl;
    }

    /**
     *
     * @return
     * The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The style
     */
    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    /**
     *
     * @param style
     * The style
     */
    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     *
     * @return
     * The supporterGrade
     */
    @JsonProperty("supporter_grade")
    public Integer getSupporterGrade() {
        return supporterGrade;
    }

    /**
     *
     * @param supporterGrade
     * The supporter_grade
     */
    @JsonProperty("supporter_grade")
    public void setSupporterGrade(Integer supporterGrade) {
        this.supporterGrade = supporterGrade;
    }

    /**
     *
     * @return
     * The taekpo
     */
    @JsonProperty("taekpo")
    public String getTaekpo() {
        return taekpo;
    }

    /**
     *
     * @param taekpo
     * The taekpo
     */
    @JsonProperty("taekpo")
    public void setTaekpo(String taekpo) {
        this.taekpo = taekpo;
    }

    /**
     *
     * @return
     * The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The target
     */
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    /**
     *
     * @param target
     * The target
     */
    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     *
     * @return
     * The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     *
     * @param uid
     * The uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     *
     * @return
     * The updatable
     */
    @JsonProperty("updatable")
    public String getUpdatable() {
        return updatable;
    }

    /**
     *
     * @param updatable
     * The updatable
     */
    @JsonProperty("updatable")
    public void setUpdatable(String updatable) {
        this.updatable = updatable;
    }

    /**
     *
     * @return
     * The updateTime
     */
    @JsonProperty("update_time")
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @param updateTime
     * The update_time
     */
    @JsonProperty("update_time")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @return
     * The used
     */
    @JsonProperty("used")
    public String getUsed() {
        return used;
    }

    /**
     *
     * @param used
     * The used
     */
    @JsonProperty("used")
    public void setUsed(String used) {
        this.used = used;
    }

    /**
     *
     * @return
     * The userCommentCount
     */
    @JsonProperty("user_comment_count")
    public Integer getUserCommentCount() {
        return userCommentCount;
    }

    /**
     *
     * @param userCommentCount
     * The user_comment_count
     */
    @JsonProperty("user_comment_count")
    public void setUserCommentCount(Integer userCommentCount) {
        this.userCommentCount = userCommentCount;
    }

    /**
     *
     * @return
     * The userDescription
     */
    @JsonProperty("user_description")
    public String getUserDescription() {
        return userDescription;
    }

    /**
     *
     * @param userDescription
     * The user_description
     */
    @JsonProperty("user_description")
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    /**
     *
     * @return
     * The userFavoriteCount
     */
    @JsonProperty("user_favorite_count")
    public Integer getUserFavoriteCount() {
        return userFavoriteCount;
    }

    /**
     *
     * @param userFavoriteCount
     * The user_favorite_count
     */
    @JsonProperty("user_favorite_count")
    public void setUserFavoriteCount(Integer userFavoriteCount) {
        this.userFavoriteCount = userFavoriteCount;
    }

    /**
     *
     * @return
     * The userGrade
     */
    @JsonProperty("user_grade")
    public Integer getUserGrade() {
        return userGrade;
    }

    /**
     *
     * @param userGrade
     * The user_grade
     */
    @JsonProperty("user_grade")
    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    /**
     *
     * @return
     * The userInterest
     */
    @JsonProperty("user_interest")
    public Integer getUserInterest() {
        return userInterest;
    }

    /**
     *
     * @param userInterest
     * The user_interest
     */
    @JsonProperty("user_interest")
    public void setUserInterest(Integer userInterest) {
        this.userInterest = userInterest;
    }

    /**
     *
     * @return
     * The userName
     */
    @JsonProperty("user_name")
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     * The user_name
     */
    @JsonProperty("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     * The userReviewCount
     */
    @JsonProperty("user_review_count")
    public Integer getUserReviewCount() {
        return userReviewCount;
    }

    /**
     *
     * @param userReviewCount
     * The user_review_count
     */
    @JsonProperty("user_review_count")
    public void setUserReviewCount(Integer userReviewCount) {
        this.userReviewCount = userReviewCount;
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
