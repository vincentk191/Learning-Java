package Spotify;

import java.util.ArrayList;

public class Spotify {
    private ArrayList<Song> songs;
    private ArrayList<Playlist> playlists;

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public Spotify(ArrayList<Song> songs, ArrayList<Playlist> playlists) {
        this.songs = songs;
        this.playlists = playlists;
    }

    Spotify(){
        System.out.println("Generated new spotify");
    }

}
