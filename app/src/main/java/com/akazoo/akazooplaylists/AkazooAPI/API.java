package com.akazoo.akazooplaylists.AkazooAPI;

import com.akazoo.akazooplaylists.Model.PlaylistResponse;
import com.akazoo.akazooplaylists.Model.PlaylistsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("playlists")
    Call<PlaylistsResponse> getPlaylists();

    @GET("playlist")
    Call<PlaylistResponse> getPlaylist(@Query("playlistid") String playlist_id);

}

