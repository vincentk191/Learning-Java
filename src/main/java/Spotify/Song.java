package Spotify;

import java.time.Duration;

public class Song extends Track {
    private String name;
    private String artist;
    private String album;
    private Duration length;

    public Song (){

    }

    public Song(String name, String artist, String album, Duration length) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Duration getLength() {
        return length;
    }

    public void setLength(Duration length) {
        this.length = length;
    }
}
