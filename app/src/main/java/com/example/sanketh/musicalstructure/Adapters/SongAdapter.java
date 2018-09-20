package com.example.sanketh.musicalstructure.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanketh.musicalstructure.Models.Song;
import com.example.sanketh.musicalstructure.R;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {
    // View lookup cache
    private static class ViewHolder {

        TextView songName;
        TextView songTimeLine;
        TextView songArtist;
        ImageView songAlbumArt;

    }

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context          is the current context (i.e. Activity) that the adapter is being created in.
     * @param SongList is the list_items of {@link Song}elements to be displayed.
     */
    public SongAdapter(Context context, List<Song> SongList) {
        super(context, 0, SongList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        // The convertView argument is essentially a "ScrapView"
        // It will have a non-null value when ListView is asking you recycle the row layout.
        // So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.song_item_layout, parent, false);

            viewHolder.songName = convertView.findViewById(R.id.songNameTextView);
            viewHolder.songTimeLine = convertView.findViewById(R.id.songTimeLineTextView);
            viewHolder.songArtist = convertView.findViewById(R.id.songArtistTextView);
            viewHolder.songAlbumArt = convertView.findViewById(R.id.song_albumArt);

            convertView.setTag(viewHolder);

        }

        // View is being recycled, retrieve the viewHolder object from tag

        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Song currentElement = getItem(position);

        // assign values if the object element is not null
        if (currentElement != null) {

            // Populate the data from the data object via the viewHolder object
            // into the template view.
            viewHolder.songName.setText(currentElement.getSongNameResId());
            viewHolder.songTimeLine.setText(currentElement.getSongTimeLineResId());

            if (currentElement.hasAlbumArt()){

                viewHolder.songAlbumArt.setImageResource(currentElement.getSongAlbumArtResId());
                viewHolder.songAlbumArt.setVisibility(View.VISIBLE);
            }

            else {

                viewHolder.songAlbumArt.setVisibility(View.GONE);
            }

            if (currentElement.hasArtist()){

                viewHolder.songArtist.setText(currentElement.getSongArtistResId());
                viewHolder.songArtist.setGravity(Gravity.CENTER_VERTICAL);
                viewHolder.songArtist.setVisibility(View.VISIBLE);

            }

            else {

                viewHolder.songArtist.setVisibility(View.GONE);
            }
        }

        // Return the whole list_items item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return convertView;
    }
}