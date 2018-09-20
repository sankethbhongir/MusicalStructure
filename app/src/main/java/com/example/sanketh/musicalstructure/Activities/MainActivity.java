package com.example.sanketh.musicalstructure.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sanketh.musicalstructure.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the view that shows albums activity
        Button albumsButton = findViewById(R.id.albumsView);

        // set OnClick listener in that view
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create an new intent to open {link:AlbumsActivity}
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);

                // start that activity
                startActivity(intent);
            }
        });

        // find the view that shows artists activity
        Button artistButton = findViewById(R.id.artistView);

        // set OnClick listener in that view
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create an new intent to open {link:ArtistsActivity}
                Intent intent = new Intent(MainActivity.this, ArtistsActivity.class);

                // start that activity
                startActivity(intent);
            }
        });

        // find the view that shows songs activity
        Button songsButton = findViewById(R.id.songView);

        // set OnClick listener in that view
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create an new intent to open {link:SongsActivity}
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);

                // start that activity
                startActivity(intent);
            }
        });


        // find the view that shows genres activity
        Button genresButton = findViewById(R.id.genreView);

        // set OnClick listener in that view
        genresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create an new intent to open {link:GenresActivity}
                Intent intent = new Intent(MainActivity.this, GenresActivity.class);

                // start that activity
                startActivity(intent);
            }
        });
    }
}
