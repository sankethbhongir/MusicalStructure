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

import com.example.sanketh.musicalstructure.Models.Artist;
import com.example.sanketh.musicalstructure.R;

import java.util.List;

public class ArtistAdapter extends ArrayAdapter<Artist> {
    // View lookup cache
    private static class ViewHolder{

        ImageView artistImage;
        TextView artistName;

    }

    /**
     * Create a new {@link ArtistAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param ArtistList is the list_items of {@link Artist}elements to be displayed.
     */
    public ArtistAdapter(Context context, List<Artist> ArtistList){
        super(context,0,ArtistList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        // The convertView argument is essentially a "ScrapView"
        // It will have a non-null value when ListView is asking you recycle the row layout.
        // So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.artist_item_layout,parent,false);

            viewHolder.artistImage = convertView.findViewById(R.id.artistImage);
            viewHolder.artistName = convertView.findViewById(R.id.artistTextView);

            convertView.setTag(viewHolder);

        }

        // View is being recycled, retrieve the viewHolder object from tag

        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Artist currentElement = getItem(position);

        // assign values if the object element is not null
        if (currentElement != null) {

            // Populate the data from the data object via the viewHolder object
            // into the template view.
            viewHolder.artistImage.setImageResource(currentElement.getArtistPhotoResId());
            viewHolder.artistName.setText(currentElement.getArtistNameResId());
        }

        // Return the whole list_items item layout (containing 1 TextViews and 1 ImageView) so that it can be shown in
        // the ListView.
        return convertView;
    }
}

