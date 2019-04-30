package Spotify;

import java.io.IOException;
import java.time.Duration;

public class Ad extends Track {
    private String name;
    private Duration length;

    public Ad(String name, Duration length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getLength() {
        return length;
    }

    public void setLength(Duration length) {
        this.length = length;
    }

    public String readTrack(Track track) throws IOException {
        String s = "";
        s += "Name: " + name + "\n";
        s += "Length: " + length + "\n";
        return s;
    }
}
