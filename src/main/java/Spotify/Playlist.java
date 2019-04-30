package Spotify;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Track> playlist;
    private String name;

    public Playlist (ArrayList<Track> playlist, String name) {
        this.playlist = playlist;
        this.name = name;
    }

    public void addTrack (Track track) {
        playlist.add(track);
    }

    public void removeTrack(Track track) {

    }

    public ArrayList<Track> getPlaylist() {
        return playlist;
    }

    public void setPlaylist (ArrayList<Track> playlist) {
        this.playlist = playlist;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
