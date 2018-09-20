package com.example.sanketh.musicalstructure.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.sanketh.musicalstructure.Models.Genre;
import com.example.sanketh.musicalstructure.R;
import java.util.ArrayList;
import java.util.List;

public class genreAdapter extends ArrayAdapter<Genre> {

    // View lookup cache
    private static class ViewHolder{

        TextView genre;

    }

    /**
     * Create a new {@link genreAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param GenreList is the list_items of {@link Genre}elements to be displayed.
     */
    public genreAdapter(Context context, List<Genre> GenreList){
        super(context,0,GenreList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        // The convertView argument is essentially a "ScrapView"
        // It will have a non-null value when ListView is asking you recycle the row layout.
        // So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.genre_item_layout,parent,false);

            viewHolder.genre = convertView.findViewById(R.id.genreTextView);


            convertView.setTag(viewHolder);

        }

        // View is being recycled, retrieve the viewHolder object from tag

        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Genre currentElement = getItem(position);

        // assign values if the object element is not null
        if (currentElement != null) {

            // Populate the data from the data object via the viewHolder object
            // into the template view.
            viewHolder.genre.setText(currentElement.getGenreNameResId());
            viewHolder.genre.setBackground(ContextCompat.getDrawable(getContext(),currentElement.getGenreGradientColorResId()));
        }

        // Return the whole list_items item layout (containing 1 TextViews) so that it can be shown in
        // the ListView.
        return convertView;
    }
}
