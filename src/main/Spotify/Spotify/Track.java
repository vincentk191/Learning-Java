package Spotify;

import java.io.IOException;

public abstract class Track {
    abstract void readTrack(Track track) throws IOException;
    abstract void playTrack(Track track) throws InterruptedException;
}
