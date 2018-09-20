package com.example.sanketh.musicalstructure.Data;

import android.content.Context;

import com.example.sanketh.musicalstructure.Models.Album;
import com.example.sanketh.musicalstructure.Models.Artist;
import com.example.sanketh.musicalstructure.Models.Genre;
import com.example.sanketh.musicalstructure.Models.Song;
import com.example.sanketh.musicalstructure.R;

import java.util.ArrayList;
import java.util.List;

public class musicData {

    public List<Album> getPopulatedAlbumList(){


        // Create an array list of library objects for albums
        List<Album> albums = new ArrayList<>();
        albums.add(new Album(R.string.album_1, R.drawable.album_one_cover, R.string.album_1_artist_name_bieber));
        albums.add(new Album(R.string.album_2, R.drawable.album_two_cover,R.string.album_2_artist_name_taylor));
        albums.add(new Album(R.string.album_3, R.drawable.album_three_cover,R.string.album_3_artist_name_ariana));
        albums.add(new Album(R.string.album_4, R.drawable.album_four_cover,R.string.album_4_artist_name_smith));
        albums.add(new Album(R.string.album_5, R.drawable.album_five_cover,R.string.album_5_artist_name_backstreet));
        albums.add(new Album(R.string.album_6, R.drawable.album_six_cover,R.string.album_6_artist_name_gaga));
        albums.add(new Album(R.string.album_7, R.drawable.album_seven_cover,R.string.album_7_artist_name_iglesias));
        albums.add(new Album(R.string.album_8, R.drawable.album_eight_cover,R.string.album_8_artist_name_eminem));
        albums.add(new Album(R.string.album_9, R.drawable.album_nine_cover,R.string.album_9_artist_name_onedirection));
        albums.add(new Album(R.string.album_10, R.drawable.album_ten_cover,R.string.album_10_artist_name_rihana));
        albums.add(new Album(R.string.album_11,R.drawable.album_eleven_cover,R.string.album_11_artist_name_beyonce));
        albums.add(new Album(R.string.album_12, R.drawable.album_twelve_cover,R.string.album_12_artist_name_maroon));

        return albums;


    }

    public List<Artist> getPopulatedArtistList(){
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(R.string.album_1_artist_name_bieber, R.drawable.justin_bieber));
        artists.add(new Artist(R.string.album_2_artist_name_taylor, R.drawable.taylor_swift));
        artists.add(new Artist(R.string.album_3_artist_name_ariana, R.drawable.ariana_grande));
        artists.add(new Artist(R.string.album_4_artist_name_smith, R.drawable.sam_smith));
        artists.add(new Artist(R.string.album_5_artist_name_backstreet, R.drawable.back_street_boys));
        artists.add(new Artist(R.string.album_6_artist_name_gaga, R.drawable.lady_gaga));
        artists.add(new Artist(R.string.album_7_artist_name_iglesias, R.drawable.enrique_iglesias));
        artists.add(new Artist(R.string.album_8_artist_name_eminem, R.drawable.eminem));
        artists.add(new Artist(R.string.album_9_artist_name_onedirection, R.drawable.one_direction));
        artists.add(new Artist(R.string.album_10_artist_name_rihana, R.drawable.rihana));
        artists.add(new Artist(R.string.album_11_artist_name_beyonce, R.drawable.beyonce));
        artists.add(new Artist(R.string.album_12_artist_name_maroon, R.drawable.maroon_five));

        return artists;
    }

    public List<Song> getPopulatedSongList() {

        List<Song> songs = new ArrayList<>();
        // Album 1 songs
        songs.add(new Song(R.string.album_1_song_1_name, R.string.album_1_song_1_timeline, R.string.album_1_artist_name_bieber, R.drawable.album_one_cover));
        songs.add(new Song(R.string.album_1_song_2_name, R.string.album_1_song_2_timeline, R.string.album_1_artist_name_bieber, R.drawable.album_one_cover));
        songs.add(new Song(R.string.album_1_song_3_name, R.string.album_1_song_3_timeline, R.string.album_1_artist_name_bieber, R.drawable.album_one_cover));
        songs.add(new Song(R.string.album_1_song_4_name, R.string.album_1_song_4_timeline, R.string.album_1_artist_name_bieber, R.drawable.album_one_cover));
        songs.add(new Song(R.string.album_1_song_5_name, R.string.album_1_song_5_timeline, R.string.album_1_artist_name_bieber, R.drawable.album_one_cover));
        // Album 2 songs
        songs.add(new Song(R.string.album_2_song_1_name, R.string.album_2_song_1_timeline, R.string.album_2_artist_name_taylor, R.drawable.album_two_cover));
        songs.add(new Song(R.string.album_2_song_2_name, R.string.album_2_song_2_timeline, R.string.album_2_artist_name_taylor, R.drawable.album_two_cover));
        songs.add(new Song(R.string.album_2_song_3_name, R.string.album_2_song_3_timeline, R.string.album_2_artist_name_taylor, R.drawable.album_two_cover));
        songs.add(new Song(R.string.album_2_song_4_name, R.string.album_2_song_4_timeline, R.string.album_2_artist_name_taylor, R.drawable.album_two_cover));
        songs.add(new Song(R.string.album_2_song_5_name, R.string.album_2_song_5_timeline, R.string.album_2_artist_name_taylor, R.drawable.album_two_cover));
        // Album 3 songs
        songs.add(new Song(R.string.album_3_song_1_name, R.string.album_3_song_1_timeline, R.string.album_3_artist_name_ariana, R.drawable.album_three_cover));
        songs.add(new Song(R.string.album_3_song_2_name, R.string.album_3_song_2_timeline, R.string.album_3_artist_name_ariana, R.drawable.album_three_cover));
        songs.add(new Song(R.string.album_3_song_3_name, R.string.album_3_song_3_timeline, R.string.album_3_artist_name_ariana, R.drawable.album_three_cover));
        songs.add(new Song(R.string.album_3_song_4_name, R.string.album_3_song_4_timeline, R.string.album_3_artist_name_ariana, R.drawable.album_three_cover));
        songs.add(new Song(R.string.album_3_song_5_name, R.string.album_3_song_5_timeline, R.string.album_3_artist_name_ariana, R.drawable.album_three_cover));
        // Album 4 songs
        songs.add(new Song(R.string.album_4_song_1_name, R.string.album_4_song_1_timeline, R.string.album_4_artist_name_smith, R.drawable.album_four_cover));
        songs.add(new Song(R.string.album_4_song_2_name, R.string.album_4_song_2_timeline, R.string.album_4_artist_name_smith, R.drawable.album_four_cover));
        songs.add(new Song(R.string.album_4_song_3_name, R.string.album_4_song_3_timeline, R.string.album_4_artist_name_smith, R.drawable.album_four_cover));
        songs.add(new Song(R.string.album_4_song_4_name, R.string.album_4_song_4_timeline, R.string.album_4_artist_name_smith, R.drawable.album_four_cover));
        songs.add(new Song(R.string.album_4_song_5_name, R.string.album_4_song_5_timeline, R.string.album_4_artist_name_smith, R.drawable.album_four_cover));
        // Album 5 songs
        songs.add(new Song(R.string.album_5_song_1_name, R.string.album_5_song_1_timeline, R.string.album_5_artist_name_backstreet, R.drawable.album_five_cover));
        songs.add(new Song(R.string.album_5_song_2_name, R.string.album_5_song_2_timeline, R.string.album_5_artist_name_backstreet, R.drawable.album_five_cover));
        songs.add(new Song(R.string.album_5_song_3_name, R.string.album_5_song_3_timeline, R.string.album_5_artist_name_backstreet, R.drawable.album_five_cover));
        songs.add(new Song(R.string.album_5_song_4_name, R.string.album_5_song_4_timeline, R.string.album_5_artist_name_backstreet, R.drawable.album_five_cover));
        songs.add(new Song(R.string.album_5_song_5_name, R.string.album_5_song_5_timeline, R.string.album_5_artist_name_backstreet, R.drawable.album_five_cover));
        // Album 6 songs
        songs.add(new Song(R.string.album_6_song_1_name, R.string.album_6_song_1_timeline, R.string.album_6_artist_name_gaga, R.drawable.album_six_cover));
        songs.add(new Song(R.string.album_6_song_2_name, R.string.album_6_song_2_timeline, R.string.album_6_artist_name_gaga, R.drawable.album_six_cover));
        songs.add(new Song(R.string.album_6_song_3_name, R.string.album_6_song_3_timeline, R.string.album_6_artist_name_gaga, R.drawable.album_six_cover));
        songs.add(new Song(R.string.album_6_song_4_name, R.string.album_6_song_4_timeline, R.string.album_6_artist_name_gaga, R.drawable.album_six_cover));
        songs.add(new Song(R.string.album_6_song_5_name, R.string.album_6_song_5_timeline, R.string.album_6_artist_name_gaga, R.drawable.album_six_cover));
        // Album 7 songs
        songs.add(new Song(R.string.album_7_song_1_name, R.string.album_7_song_1_timeline, R.string.album_7_artist_name_iglesias, R.drawable.album_seven_cover));
        songs.add(new Song(R.string.album_7_song_2_name, R.string.album_7_song_2_timeline, R.string.album_7_artist_name_iglesias, R.drawable.album_seven_cover));
        songs.add(new Song(R.string.album_7_song_3_name, R.string.album_7_song_3_timeline, R.string.album_7_artist_name_iglesias, R.drawable.album_seven_cover));
        songs.add(new Song(R.string.album_7_song_4_name, R.string.album_7_song_4_timeline, R.string.album_7_artist_name_iglesias, R.drawable.album_seven_cover));
        songs.add(new Song(R.string.album_7_song_5_name, R.string.album_7_song_5_timeline, R.string.album_7_artist_name_iglesias, R.drawable.album_seven_cover));
        // Album 8 songs
        songs.add(new Song(R.string.album_8_song_1_name, R.string.album_8_song_1_timeline, R.string.album_8_artist_name_eminem, R.drawable.album_eight_cover));
        songs.add(new Song(R.string.album_8_song_2_name, R.string.album_8_song_2_timeline, R.string.album_8_artist_name_eminem, R.drawable.album_eight_cover));
        songs.add(new Song(R.string.album_8_song_3_name, R.string.album_8_song_3_timeline, R.string.album_8_artist_name_eminem, R.drawable.album_eight_cover));
        songs.add(new Song(R.string.album_8_song_4_name, R.string.album_8_song_4_timeline, R.string.album_8_artist_name_eminem, R.drawable.album_eight_cover));
        songs.add(new Song(R.string.album_8_song_5_name, R.string.album_8_song_5_timeline, R.string.album_8_artist_name_eminem, R.drawable.album_eight_cover));
        // Album 9 songs
        songs.add(new Song(R.string.album_9_song_1_name, R.string.album_9_song_1_timeline, R.string.album_9_artist_name_onedirection, R.drawable.album_nine_cover));
        songs.add(new Song(R.string.album_9_song_2_name, R.string.album_9_song_2_timeline, R.string.album_9_artist_name_onedirection, R.drawable.album_nine_cover));
        songs.add(new Song(R.string.album_9_song_3_name, R.string.album_9_song_3_timeline, R.string.album_9_artist_name_onedirection, R.drawable.album_nine_cover));
        songs.add(new Song(R.string.album_9_song_4_name, R.string.album_9_song_4_timeline, R.string.album_9_artist_name_onedirection, R.drawable.album_nine_cover));
        songs.add(new Song(R.string.album_9_song_5_name, R.string.album_9_song_5_timeline, R.string.album_9_artist_name_onedirection, R.drawable.album_nine_cover));
        // Album 10 songs
        songs.add(new Song(R.string.album_10_song_1_name, R.string.album_2_song_1_timeline, R.string.album_10_artist_name_rihana, R.drawable.album_ten_cover));
        songs.add(new Song(R.string.album_10_song_2_name, R.string.album_2_song_2_timeline, R.string.album_10_artist_name_rihana, R.drawable.album_ten_cover));
        songs.add(new Song(R.string.album_10_song_3_name, R.string.album_2_song_3_timeline, R.string.album_10_artist_name_rihana, R.drawable.album_ten_cover));
        songs.add(new Song(R.string.album_10_song_4_name, R.string.album_2_song_4_timeline, R.string.album_10_artist_name_rihana, R.drawable.album_ten_cover));
        songs.add(new Song(R.string.album_10_song_5_name, R.string.album_2_song_5_timeline, R.string.album_10_artist_name_rihana, R.drawable.album_ten_cover));
        // Album 11 songs
        songs.add(new Song(R.string.album_11_song_1_name, R.string.album_11_song_1_timeline, R.string.album_11_artist_name_beyonce, R.drawable.album_eleven_cover));
        songs.add(new Song(R.string.album_11_song_2_name, R.string.album_11_song_2_timeline, R.string.album_11_artist_name_beyonce, R.drawable.album_eleven_cover));
        songs.add(new Song(R.string.album_11_song_3_name, R.string.album_11_song_3_timeline, R.string.album_11_artist_name_beyonce, R.drawable.album_eleven_cover));
        songs.add(new Song(R.string.album_11_song_4_name, R.string.album_11_song_4_timeline, R.string.album_11_artist_name_beyonce, R.drawable.album_eleven_cover));
        songs.add(new Song(R.string.album_11_song_5_name, R.string.album_11_song_5_timeline, R.string.album_11_artist_name_beyonce, R.drawable.album_eleven_cover));

        // Album 12 songs
        songs.add(new Song(R.string.album_12_song_1_name, R.string.album_12_song_1_timeline, R.string.album_12_artist_name_maroon, R.drawable.album_twelve_cover));
        songs.add(new Song(R.string.album_12_song_2_name, R.string.album_12_song_2_timeline, R.string.album_12_artist_name_maroon, R.drawable.album_twelve_cover));
        songs.add(new Song(R.string.album_12_song_3_name, R.string.album_12_song_3_timeline, R.string.album_12_artist_name_maroon, R.drawable.album_twelve_cover));
        songs.add(new Song(R.string.album_12_song_4_name, R.string.album_12_song_4_timeline, R.string.album_12_artist_name_maroon, R.drawable.album_twelve_cover));
        songs.add(new Song(R.string.album_12_song_5_name, R.string.album_12_song_5_timeline, R.string.album_12_artist_name_maroon, R.drawable.album_twelve_cover));

        return songs;
    }


    public List<Genre> getPopulatedGenreList(){

        List<Genre> genres = new ArrayList<>();

        genres.add(new Genre(R.string.genre1_desi, R.drawable.desi_genre_color));
        genres.add(new Genre(R.string.genre2_pop, R.drawable.pop_genre_color));
        genres.add(new Genre(R.string.genre3_dance,R.drawable.dance_genre_color));
        genres.add(new Genre(R.string.genre4_electronic, R.drawable.electronic_genre_color));
        genres.add(new Genre(R.string.genre5_rock, R.drawable.rock_genre_color));
        genres.add(new Genre(R.string.genre6_mood, R.drawable.mood_genre_color));
        genres.add(new Genre(R.string.genre7_hipHop, R.drawable.hip_hop_genre_color));
        genres.add(new Genre(R.string.genre8_workout,R.drawable.workout_genre_color));
        genres.add(new Genre(R.string.genre9_country, R.drawable.country_genre_color));
        genres.add(new Genre(R.string.genre10_chill, R.drawable.chill_genre_color));
        genres.add(new Genre(R.string.genre11_party, R.drawable.party_genre_color));
        genres.add(new Genre(R.string.genre12_jazz, R.drawable.jazz_genre_color));
        genres.add(new Genre(R.string.genre13_classic, R.drawable.classic_genre_color));
        genres.add(new Genre(R.string.genre14_romance, R.drawable.romace_genre_color));
        genres.add(new Genre(R.string.genre15_metal,R.drawable.metal_genre_color));
        genres.add(new Genre(R.string.genre16_sleep, R.drawable.sleep_genre_color));

        return genres;

    }


}
