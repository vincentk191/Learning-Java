package Spotify;

import java.io.IOException;

public abstract class Track {
    abstract String readTrack(Track track) throws IOException;
}
