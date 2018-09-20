package com.example.sanketh.musicalstructure.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanketh.musicalstructure.Models.Album;

import com.example.sanketh.musicalstructure.R;

import java.util.List;

/**
 * {@link AlbumAdapter} is an {@link ArrayAdapter} that can provide the layout for each list_items item
 * based on a data source, which is a list_items of {@link Album} objects.
 */
public class AlbumAdapter extends ArrayAdapter<Album> {



    // View lookup cache
    private static class ViewHolder{

        ImageView albumCover;
        TextView albumName;
        TextView albumArtist;

    }

    /**
     * Create a new {@link AlbumAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param AlbumList is the list_items of {@link Album}elements to be displayed.
     */
    public AlbumAdapter(Context context, List<Album> AlbumList){
        super(context,0,AlbumList);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        // The convertView argument is essentially a "ScrapView"
        // It will have a non-null value when ListView is asking you recycle the row layout.
        // So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.album_item_layout,parent,false);

            viewHolder.albumCover = convertView.findViewById(R.id.albumCoverImage);
            viewHolder.albumName = convertView.findViewById(R.id.albumNameTextView);
            viewHolder.albumArtist = convertView.findViewById(R.id.albumArtistTextView);

            convertView.setTag(viewHolder);

        }

        // View is being recycled, retrieve the viewHolder object from tag

        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

         final Album currentElement = getItem(position);

        // assign values if the object element is not null
        if (currentElement != null) {

            // Populate the data from the data object via the viewHolder object
            // into the template view.
            viewHolder.albumCover.setImageResource(currentElement.getAlbumArtResId());
            viewHolder.albumName.setText(currentElement.getAlbumNameResId());
            viewHolder.albumArtist.setText(currentElement.getArtistNameResId());

        }

        // Return the whole list_items item layout (containing 2 TextViews and 1 ImageView) so that it can be shown in
        // the GirdView.
        return convertView;
    }
}
