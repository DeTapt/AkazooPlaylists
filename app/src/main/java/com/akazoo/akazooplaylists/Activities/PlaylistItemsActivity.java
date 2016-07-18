package com.akazoo.akazooplaylists.Activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.akazoo.akazooplaylists.Adapter.PlaylistItemsAdapter;
import com.akazoo.akazooplaylists.AkazooAPI.API;
import com.akazoo.akazooplaylists.AkazooAPI.ApiClient;
import com.akazoo.akazooplaylists.Model.PlaylistItem;
import com.akazoo.akazooplaylists.Model.PlaylistResponse;
import com.akazoo.akazooplaylists.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class PlaylistItemsActivity extends BaseActivity {

    private RecyclerView rv_playlist_items;
    private PlaylistItemsAdapter adapter;
    private String playlist_id;
    private API apiService;
    private List<PlaylistItem> all_playlist_items = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        apiService = ApiClient.getClient().create(API.class);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            playlist_id = extras.getString("PLAYLIST_ID");
        }

        rv_playlist_items = (RecyclerView) findViewById(R.id.rv_playlist_items);

        initRecyclerView();

        makeRequest();
    }


    private void makeRequest() {
        if(NetworkExists(this)){
            getPlaylistItems();
        }
        else{
            networkError();
            finish();
        }
    }

    private void getPlaylistItems() {
        initProgressDialog();
        showProgressDialog();
        Call<PlaylistResponse> playlistResponseCall = apiService.getPlaylist(playlist_id);
        playlistResponseCall.enqueue(new Callback<PlaylistResponse>() {
            @Override
            public void onResponse(Call<PlaylistResponse> call, Response<PlaylistResponse> response) {
                all_playlist_items.addAll(response.body().getResult().getItems());
                adapter.notifyDataSetChanged();
                dismissProgressDialog();
            }

            @Override
            public void onFailure(Call<PlaylistResponse> call, Throwable t) {
                responseError();
            }
        });
    }

    private void initRecyclerView() {
        all_playlist_items.clear();
        rv_playlist_items.setHasFixedSize(true);
        rv_playlist_items.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PlaylistItemsAdapter(all_playlist_items,R.layout.list_item_playlist_item, getApplicationContext());
        rv_playlist_items.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
