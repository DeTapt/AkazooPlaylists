package com.akazoo.akazooplaylists.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.akazoo.akazooplaylists.Model.Playlist;
import com.akazoo.akazooplaylists.R;

import java.util.List;


public class PlaylistsAdapter extends RecyclerView.Adapter<PlaylistsAdapter.PlaylistViewHolder>  {

    private List<Playlist> playlists;
    private int rowLayout;
    private PlaylistItemClickListener clickListener;

    public interface PlaylistItemClickListener {
        void playlistItemOnClick(Playlist playlist);

    }

    static class PlaylistViewHolder extends RecyclerView.ViewHolder {
        LinearLayout movies_layout;
        TextView tv_title;
        TextView tv_items;

        PlaylistViewHolder(View v) {
            super(v);
            movies_layout = (LinearLayout) v.findViewById(R.id.movies_layout);
            tv_title = (TextView) v.findViewById(R.id.tv_title);
            tv_items = (TextView) v.findViewById(R.id.tv_items);

        }
    }

    public PlaylistsAdapter(List<Playlist> playlists, int rowLayout) {
        this.playlists = playlists;
        this.rowLayout = rowLayout;
    }

    @Override
    public PlaylistsAdapter.PlaylistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PlaylistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaylistViewHolder holder, final int position) {
        holder.tv_title.setText(playlists.get(position).getName());
        holder.tv_items.setText(String.valueOf(playlists.get(position).getItemCount()));


        holder.movies_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.playlistItemOnClick(playlists.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }

    public void setPlaylistItemsClickListener(PlaylistItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

}
