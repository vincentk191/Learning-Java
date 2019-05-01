package Spotify;

import java.io.IOException;
import java.time.Duration;

public class Song extends Track {
    private String name;
    private String artist;
    private String album;
    private Duration length;

    public void readTrack(Track track) throws IOException {

    }

    public void playTrack(Track track) throws InterruptedException {

    }

    public Song(String name, String artist, String album, Duration length) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    @Override
    public String toString(){
        String s = "";

        int m = Math.toIntExact(length.toSeconds() / 60);
        String minutes = String.format("%02d", m);
        int sc = Math.toIntExact(length.toSeconds() - m * 60);
        String seconds = String.format("%02d", sc);

        s += "Song: " + name + "\n";
        s += "Artist: " + artist + "\n";
        s += "Album: " + album + "\n";
        s += "Duration: " + minutes + ":" + seconds + "\n";

        return s;
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
