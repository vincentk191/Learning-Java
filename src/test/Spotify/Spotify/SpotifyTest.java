package Spotify;


import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;

public class SpotifyTest {

    @Test
    void addSong(){
        Spotify spotify = new Spotify();
        LocalTime lt = LocalTime.parse("00:14:30");
        Song s = new Song("Next Up Forever","AJR","NeoTheater", Duration.between(LocalTime.MIN, lt));
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(s);
        spotify.setSongs(songs);
        assert spotify.getSongs().get(0).equals(s) : "False Song";
        System.out.println(s.toString());
    }

    @Test
    void addMultipleSongs(){

    }

    @Test
    void addPlaylist(){
        Spotify spotify = new Spotify();
        ArrayList<Track> playlist = new ArrayList<Track>();


    }

    @Test
    void addSongP(){

    }

    @Test
    void listPlaylist(){

    }

    @Test
    void listSongs(){

    }

    @Test
    void listSongsP(){

    }

}
