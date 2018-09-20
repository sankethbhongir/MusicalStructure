package com.example.sanketh.musicalstructure.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sanketh.musicalstructure.Adapters.SongAdapter;
import com.example.sanketh.musicalstructure.Data.musicData;
import com.example.sanketh.musicalstructure.Models.Song;
import com.example.sanketh.musicalstructure.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DetailsActivity extends AppCompatActivity {

    private TextView name_textView;
   private ImageView cover_imageView;
   private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(Objects.requireNonNull(getIntent().getExtras()).getInt("albumName") != 0)
            setTheme(R.style.AlbumsTheme);
        else
            setTheme(R.style.ArtistsTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // setting up button
        if (getSupportActionBar()!= null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        name_textView = findViewById(R.id.name_detailsActivity);
        cover_imageView = findViewById(R.id.photo_detailsActivity);
        listView = findViewById(R.id.song_list_for_album);
        listingSongsForAlbumsAndArtists();

    }

    /**
     * listing songs through album and artist.
     */

    public void listingSongsForAlbumsAndArtists(){
        final List<Song> songList = new musicData().getPopulatedSongList();
      final   List<Song> albumSongList = new ArrayList<>();
        Bundle bundle = getIntent().getExtras();
        int albumNameResId,albumArtistResId,albumArtResId,artistNameResId,artistPhotoResId;

        if (bundle != null){
            albumNameResId = bundle.getInt("albumName");
            albumArtistResId = bundle.getInt("albumArtistName");
            albumArtResId = bundle.getInt("albumArt");
            artistNameResId = bundle.getInt("artistName");
            artistPhotoResId = bundle.getInt("artistPhoto");

            if (albumNameResId != 0){
                name_textView.setText(getResources().getString(albumNameResId));
                cover_imageView.setImageResource(albumArtResId);
                Objects.requireNonNull(getSupportActionBar()).setTitle("Album songs");

                for (Song song: songList){

                    if (song.getSongAlbumArtResId() == albumArtResId){
                        albumSongList.add(new Song(song.getSongNameResId(),song.getSongTimeLineResId()));
                    }

                }

            }
            else {
                name_textView.setText(getResources().getString(artistNameResId));
                name_textView.setGravity(Gravity.CENTER_HORIZONTAL);
                cover_imageView.setImageResource(artistPhotoResId);
                Objects.requireNonNull(getSupportActionBar()).setTitle("Artist songs");

                for (Song song: songList){

                    if (song.getSongArtistResId() == artistNameResId){
                        albumSongList.add(new Song(song.getSongNameResId(),song.getSongTimeLineResId(),song.getSongAlbumArtResId()));
                    }

            }

        }

            SongAdapter adapter = new SongAdapter(this, albumSongList);
            listView.setAdapter(adapter);

    }
}
}


