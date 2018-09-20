package com.example.sanketh.musicalstructure.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sanketh.musicalstructure.Data.musicData;
import com.example.sanketh.musicalstructure.Models.Genre;
import com.example.sanketh.musicalstructure.R;
import com.example.sanketh.musicalstructure.Adapters.genreAdapter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);

        // setting up button
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Create an array list of library objects for genres
        List<Genre> genres = new musicData().getPopulatedGenreList();


        // sorting the genres in alphabetical order
        Comparator<Genre> comparator = new Comparator<Genre>() {
            @Override
            public int compare(Genre g1, Genre g2) {
                return getString(g1.getGenreNameResId()).trim().compareTo(getString(g2.getGenreNameResId()).trim());
            }
        };
        Collections.sort(genres,comparator);

        // Create an {@link genreAdapter}, whose data source is a list of {@link genres}. The
        // adapter knows how to create list items for each item in the list.
        genreAdapter adapter = new genreAdapter(this, genres);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_items.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link adapter} we created above, so that the
        // {@link ListView} will display list items for each artists in the list.
        listView.setAdapter(adapter);
    }

}
