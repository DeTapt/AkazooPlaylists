package com.akazoo.akazooplaylists.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.akazoo.akazooplaylists.Model.PlaylistItem;
import com.akazoo.akazooplaylists.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class PlaylistItemsAdapter extends RecyclerView.Adapter<PlaylistItemsAdapter.PlaylistitemsViewHolder> {

    private List<PlaylistItem> all_playlist_items;
    private int rowLayout;
    private Context context;


    static class PlaylistitemsViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item;
        TextView tv_track_name;
        TextView tv_artist;

        PlaylistitemsViewHolder(View v) {
            super(v);
            img_item = (ImageView) v.findViewById(R.id.img_item);
            tv_track_name = (TextView) v.findViewById(R.id.tv_track_name);
            tv_artist = (TextView) v.findViewById(R.id.tv_artist);

        }
    }

    public PlaylistItemsAdapter(List<PlaylistItem> all_playlist_items, int rowLayout, Context context) {
        this.all_playlist_items = all_playlist_items;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public PlaylistItemsAdapter.PlaylistitemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PlaylistItemsAdapter.PlaylistitemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaylistitemsViewHolder holder, int position) {
        holder.tv_track_name.setText(all_playlist_items.get(position).getTrackName());
        holder.tv_artist.setText(all_playlist_items.get(position).getArtistName());
        Picasso.with(context).load(all_playlist_items.get(position).getImageUrl()).placeholder(R.drawable.placeholder_akazoo).into(holder.img_item);
    }

    @Override
    public int getItemCount() {
        return all_playlist_items.size();
    }

}
