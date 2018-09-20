package com.example.sanketh.musicalstructure.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sanketh.musicalstructure.Adapters.ArtistAdapter;
import com.example.sanketh.musicalstructure.Data.musicData;
import com.example.sanketh.musicalstructure.Models.Artist;
import com.example.sanketh.musicalstructure.R;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        // setting up button
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Create an array list of library objects for artists
        final List<Artist> artists = new musicData().getPopulatedArtistList() ;


        // sorting the artists in alphabetical order
        Comparator<Artist> comp = new Comparator<Artist>() {
            @Override
            public int compare(Artist a1,Artist a2) {
                return getString(a1.getArtistNameResId()).trim().compareTo(getString(a2.getArtistNameResId()).trim());
            }
        };
        Collections.sort(artists, comp);

        // Create an {@link ArtistAdapter}, whose data source is a list of {@link artists}. The
        // adapter knows how to create list items for each item in the list.
        ArtistAdapter adapter = new ArtistAdapter(ArtistsActivity.this,artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_items.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link adapter} we created above, so that the
        // {@link ListView} will display list items for each artists in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(ArtistsActivity.this,DetailsActivity.class);
                intent.putExtra("artistName", artists.get(position).getArtistNameResId());
                intent.putExtra("artistPhoto",artists.get(position).getArtistPhotoResId());
                startActivity(intent);
            }
        });


    }
}
