package com.example.sanketh.musicalstructure.Models;

public class Genre {

    private int genreNameResId;
    private int genreGradientColorResId;


    public Genre(int genreNameResId, int genreGradientColorResId){

        this.genreNameResId = genreNameResId;
        this.genreGradientColorResId = genreGradientColorResId;
    }

    public int getGenreNameResId() {
        return genreNameResId;
    }

    public int getGenreGradientColorResId() {
        return genreGradientColorResId;
    }
}
