package com.example.sanketh.musicalstructure.Models;

public class Song {

    private int songNameResId;
    private int songTimeLineResId;
    private int songArtistResId = NO_ART_ARTIST_PROVIDED;
    private int songAlbumArtResId= NO_ART_ARTIST_PROVIDED;
    private static final int NO_ART_ARTIST_PROVIDED = -1;

    public Song(int songNameResId, int songTimeLineResId){
        this.songNameResId = songNameResId;
        this.songTimeLineResId = songTimeLineResId;
    }

    public Song(int songNameResId, int songTimeLineResId, int songAlbumArtResId){

        this.songNameResId = songNameResId;
        this.songTimeLineResId = songTimeLineResId;
        this.songAlbumArtResId = songAlbumArtResId;
    }



    public Song(int songNameResId, int songTimeLineResId, int songArtistResId, int songAlbumArtResId){

        this.songNameResId = songNameResId;
        this.songTimeLineResId = songTimeLineResId;
        this.songArtistResId = songArtistResId;
        this.songAlbumArtResId = songAlbumArtResId;
    }

    public int getSongNameResId() {
        return songNameResId;
    }

    public int getSongTimeLineResId() {
        return songTimeLineResId;
    }

    public int getSongArtistResId() {
        return songArtistResId;
    }

    public int getSongAlbumArtResId() {
        return songAlbumArtResId;
    }

    public boolean hasAlbumArt(){
        return songAlbumArtResId != NO_ART_ARTIST_PROVIDED;
    }

    public boolean hasArtist(){
        return songArtistResId != NO_ART_ARTIST_PROVIDED;
    }
}
