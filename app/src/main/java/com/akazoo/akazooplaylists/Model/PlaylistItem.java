package com.akazoo.akazooplaylists.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaylistItem {

    @SerializedName("ObjectType")
    @Expose
    private String objectType;
    @SerializedName("ArtistId")
    @Expose
    private Integer artistId;
    @SerializedName("ArtistName")
    @Expose
    private String artistName;
    @SerializedName("Genres")
    @Expose
    private Object genres;
    @SerializedName("IsExplicit")
    @Expose
    private Boolean isExplicit;
    @SerializedName("IsOwner")
    @Expose
    private Boolean isOwner;
    @SerializedName("IsPreview")
    @Expose
    private Boolean isPreview;
    @SerializedName("IsStreamable")
    @Expose
    private Boolean isStreamable;
    @SerializedName("IsUserFan")
    @Expose
    private Boolean isUserFan;
    @SerializedName("ModuleId")
    @Expose
    private String moduleId;
    @SerializedName("TrackDuration")
    @Expose
    private Integer trackDuration;
    @SerializedName("TrackId")
    @Expose
    private Integer trackId;
    @SerializedName("TrackName")
    @Expose
    private String trackName;
    @SerializedName("TrackNumber")
    @Expose
    private Integer trackNumber;
    @SerializedName("UserMark")
    @Expose
    private Integer userMark;
    @SerializedName("AlbumId")
    @Expose
    private Integer albumId;
    @SerializedName("AlbumName")
    @Expose
    private String albumName;
    @SerializedName("DateUserAdded")
    @Expose
    private String dateUserAdded;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("LargeImageUrl")
    @Expose
    private String largeImageUrl;
    @SerializedName("ItemId")
    @Expose
    private Integer itemId;
    @SerializedName("Position")
    @Expose
    private Integer position;
    @SerializedName("StreamingModuleId")
    @Expose
    private String streamingModuleId;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Object getGenres() {
        return genres;
    }

    public void setGenres(Object genres) {
        this.genres = genres;
    }

    public Boolean getIsExplicit() {
        return isExplicit;
    }

    public void setIsExplicit(Boolean isExplicit) {
        this.isExplicit = isExplicit;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public Boolean getIsPreview() {
        return isPreview;
    }

    public void setIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
    }

    public Boolean getIsStreamable() {
        return isStreamable;
    }

    public void setIsStreamable(Boolean isStreamable) {
        this.isStreamable = isStreamable;
    }

    public Boolean getIsUserFan() {
        return isUserFan;
    }

    public void setIsUserFan(Boolean isUserFan) {
        this.isUserFan = isUserFan;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(Integer trackDuration) {
        this.trackDuration = trackDuration;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Integer getUserMark() {
        return userMark;
    }

    public void setUserMark(Integer userMark) {
        this.userMark = userMark;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getDateUserAdded() {
        return dateUserAdded;
    }

    public void setDateUserAdded(String dateUserAdded) {
        this.dateUserAdded = dateUserAdded;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getStreamingModuleId() {
        return streamingModuleId;
    }

    public void setStreamingModuleId(String streamingModuleId) {
        this.streamingModuleId = streamingModuleId;
    }

}

