package com.akazoo.akazooplaylists.Activities;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.akazoo.akazooplaylists.Adapter.PlaylistsAdapter;
import com.akazoo.akazooplaylists.AkazooAPI.API;
import com.akazoo.akazooplaylists.AkazooAPI.ApiClient;
import com.akazoo.akazooplaylists.Model.Playlist;
import com.akazoo.akazooplaylists.Model.PlaylistsResponse;
import com.akazoo.akazooplaylists.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements PlaylistsAdapter.PlaylistItemClickListener {

    private API apiService;
    private RecyclerView rv_playlists;
    private PlaylistsAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private List<Playlist> all_playlists = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = ApiClient.getClient().create(API.class);

        rv_playlists = (RecyclerView) findViewById(R.id.rv_playlists);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                makeRequest();
            }
        });


        if(Playlist.count(Playlist.class) > 0){
            all_playlists = Playlist.listAll(Playlist.class);
            initRecyclerView();
        }
        else{
            initRecyclerView();
            makeRequest();
        }
    }

    private void makeRequest() {
        if(NetworkExists(MainActivity.this)){
            getPlaylists();
        }
        else{
            networkError();
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    private void initRecyclerView() {
        rv_playlists.setHasFixedSize(true);
        rv_playlists.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PlaylistsAdapter(all_playlists, R.layout.list_item_playlist);
        adapter.setPlaylistItemsClickListener(this);
        rv_playlists.setAdapter(adapter);
    }

    private void getPlaylists() {
        swipeRefreshLayout.setRefreshing(true);
        Call<PlaylistsResponse> playlist_call = apiService.getPlaylists();
        playlist_call.enqueue(new Callback<PlaylistsResponse>() {
            @Override
            public void onResponse(Call<PlaylistsResponse> call, Response<PlaylistsResponse> response) {

                clearDB();
                storeData(response);
                adapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);

            }

            @Override
            public void onFailure(Call<PlaylistsResponse> call, Throwable t) {
                responseError();
            }
        });
    }

    private void storeData(Response<PlaylistsResponse> response) {
        for(int i = 0 ; i < response.body().getPlaylists().size() ; i++) {
            Playlist response_playlist = response.body().getPlaylists().get(i);
            all_playlists.add(response_playlist);
            response_playlist.save();
        }

    }

    private void clearDB() {
        Playlist.deleteAll(Playlist.class);
        all_playlists.clear();
    }

    @Override
    public void playlistItemOnClick(Playlist playlist) {
        Intent playlistIntent = new Intent(MainActivity.this, PlaylistItemsActivity.class);
        playlistIntent.putExtra("PLAYLIST_ID",playlist.getPlaylistId());
        startActivity(playlistIntent);
    }

}

