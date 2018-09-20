package com.example.sanketh.musicalstructure.Models;

public class Artist {

    private int artistNameResId, artistPhotoResId;

    public Artist(int artistNameResId, int artistPhotoResId){

        this.artistNameResId = artistNameResId;
        this.artistPhotoResId = artistPhotoResId;

    }
    public int getArtistNameResId() {
        return artistNameResId;
    }

    public int getArtistPhotoResId() {
        return artistPhotoResId;
    }
}
