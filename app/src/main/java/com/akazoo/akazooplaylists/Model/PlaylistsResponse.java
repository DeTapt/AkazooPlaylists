package com.akazoo.akazooplaylists.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;



public class PlaylistsResponse {

    @SerializedName("ErrorData")
    @Expose
    private String errorData;
    @SerializedName("ErrorId")
    @Expose
    private Integer errorId;
    @SerializedName("IsError")
    @Expose
    private Boolean isError;
    @SerializedName("Result")
    @Expose
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public PlaylistsResponse() {
    }


    public PlaylistsResponse(String errorData, Integer errorId, Boolean isError, ArrayList<Playlist> playlists) {
        this.errorData = errorData;
        this.errorId = errorId;
        this.isError = isError;
        this.playlists = playlists;
    }

    public String getErrorData() {
        return errorData;
    }

    public void setErrorData(String errorData) {
        this.errorData = errorData;
    }

    public Integer getErrorId() {
        return errorId;
    }


    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }


    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

}
