package com.akazoo.akazooplaylists.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaylistResponse {

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
    private PlaylistResult playlistResult;

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


    public PlaylistResult getResult() {
        return playlistResult;
    }


    public void setResult(PlaylistResult playlistResult) {
        this.playlistResult = playlistResult;
    }
}
