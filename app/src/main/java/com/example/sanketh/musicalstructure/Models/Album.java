package com.example.sanketh.musicalstructure.Models;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private int albumNameResId;
    private int albumArtResId;
    private int artistNameResId;

    public Album(int albumNameResId, int albumArtResId, int artistNameResId){

        this.albumNameResId = albumNameResId;
        this.albumArtResId = albumArtResId;
        this.artistNameResId = artistNameResId;
    }



    public int getAlbumNameResId() {
        return albumNameResId;
    }

    public int getAlbumArtResId() {
        return albumArtResId;
    }

    public int getArtistNameResId() {
        return artistNameResId;
    }


}
