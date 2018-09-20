package com.example.sanketh.musicalstructure.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sanketh.musicalstructure.Data.musicData;
import com.example.sanketh.musicalstructure.Models.Song;
import com.example.sanketh.musicalstructure.R;
import com.example.sanketh.musicalstructure.Adapters.SongAdapter;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        // setting up button
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Create an array list of library objects for songs
        List<Song> songs = new musicData().getPopulatedSongList();

        Collections.shuffle(songs);

        // Create an {@link SongAdapter}, whose data source is a list of {@link songs}. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_items.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link adapter} we created above, so that the
        // {@link ListView} will display list items for each artists in the list.
        listView.setAdapter(adapter);



























    }
}
