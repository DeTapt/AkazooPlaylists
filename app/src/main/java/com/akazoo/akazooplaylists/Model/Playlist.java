package com.akazoo.akazooplaylists.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

public class Playlist extends SugarRecord {

    @SerializedName("ObjectType")
    @Expose
    private String objectType;
    @SerializedName("DateUpdated")
    @Expose
    private String dateUpdated;
    @SerializedName("Duration")
    @Expose
    private Integer duration;
    @SerializedName("FanCount")
    @Expose
    private Integer fanCount;
    @SerializedName("IsOwner")
    @Expose
    private Boolean isOwner;
    @SerializedName("ItemCount")
    @Expose
    private Integer itemCount;
    @SerializedName("LargePhotoUrl")
    @Expose
    private String largePhotoUrl;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("OwnerId")
    @Expose
    private String ownerId;
    @SerializedName("OwnerNickName")
    @Expose
    private String ownerNickName;
    @SerializedName("OwnerPhotoUrl")
    @Expose
    private String ownerPhotoUrl;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("PlaylistId")
    @Expose
    private String playlistId;
    @SerializedName("ViewerIsFan")
    @Expose
    private Boolean viewerIsFan;


    public Playlist() {
    }


    public Playlist(String objectType, String dateUpdated, Integer duration, Integer fanCount, Boolean isOwner, Integer itemCount, String largePhotoUrl, String name, String ownerId, String ownerNickName, String ownerPhotoUrl, String photoUrl, String playlistId, Boolean viewerIsFan) {
        this.objectType = objectType;
        this.dateUpdated = dateUpdated;
        this.duration = duration;
        this.fanCount = fanCount;
        this.isOwner = isOwner;
        this.itemCount = itemCount;
        this.largePhotoUrl = largePhotoUrl;
        this.name = name;
        this.ownerId = ownerId;
        this.ownerNickName = ownerNickName;
        this.ownerPhotoUrl = ownerPhotoUrl;
        this.photoUrl = photoUrl;
        this.playlistId = playlistId;
        this.viewerIsFan = viewerIsFan;
    }


    public String getObjectType() {
        return objectType;
    }


    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }


    public String getDateUpdated() {
        return dateUpdated;
    }


    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public Integer getFanCount() {
        return fanCount;
    }


    public void setFanCount(Integer fanCount) {
        this.fanCount = fanCount;
    }


    public Boolean getIsOwner() {
        return isOwner;
    }


    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }


    public Integer getItemCount() {
        return itemCount;
    }


    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }


    public String getLargePhotoUrl() {
        return largePhotoUrl;
    }


    public void setLargePhotoUrl(String largePhotoUrl) {
        this.largePhotoUrl = largePhotoUrl;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }


    public String getOwnerNickName() {
        return ownerNickName;
    }


    public void setOwnerNickName(String ownerNickName) {
        this.ownerNickName = ownerNickName;
    }


    public String getOwnerPhotoUrl() {
        return ownerPhotoUrl;
    }


    public void setOwnerPhotoUrl(String ownerPhotoUrl) {
        this.ownerPhotoUrl = ownerPhotoUrl;
    }


    public String getPhotoUrl() {
        return photoUrl;
    }


    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }


    public String getPlaylistId() {
        return playlistId;
    }


    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }


    public Boolean getViewerIsFan() {
        return viewerIsFan;
    }


    public void setViewerIsFan(Boolean viewerIsFan) {
        this.viewerIsFan = viewerIsFan;
    }

}

