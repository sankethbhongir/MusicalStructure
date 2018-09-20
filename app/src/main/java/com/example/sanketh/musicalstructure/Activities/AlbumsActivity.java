package com.example.sanketh.musicalstructure.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.sanketh.musicalstructure.Adapters.AlbumAdapter;
import com.example.sanketh.musicalstructure.Data.musicData;
import com.example.sanketh.musicalstructure.Models.Album;
import com.example.sanketh.musicalstructure.R;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_items);

        // setting up button
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Create an array list of library objects for albums
        final List<Album> albums = new musicData().getPopulatedAlbumList();

        Collections.shuffle(albums);

        // Create an {@link AlbumAdapter}, whose data source is a list of {@link albums}. The
        // adapter knows how to create grid items for each item in the grid.
       AlbumAdapter albumAdapter = new AlbumAdapter(AlbumsActivity.this, albums);

        // Find the {@link GridView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link GridView} with the view ID called grid, which is declared in the
        // gird_items.xml layout file.
        GridView albumGridView = findViewById(R.id.grid);

        // Make the {@link GridView} use the {@link AlbumAdapter} we created above, so that the
        // {@link GridView} will display grid items for each album in the grid.
        albumGridView.setAdapter(albumAdapter);

        // setting up click listener
        albumGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AlbumsActivity.this, DetailsActivity.class);
                intent.putExtra("albumName",albums.get(position).getAlbumNameResId());
                intent.putExtra("albumArtistName",albums.get(position).getArtistNameResId());
                intent.putExtra("albumArt",albums.get(position).getAlbumArtResId());
                startActivity(intent);
            }
        });




    }
}
