package Spotify;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

    public void readTrack(Track track) throws IOException {

    }

    public void playTrack(Track track) throws InterruptedException {
        boolean x=true;
        long displayMinutes=0;
        long starttime=System.currentTimeMillis();
        long timepassed=System.currentTimeMillis()-starttime;
        long endtime=this.getLength().toMillis();

        System.out.println("Length: " + this.getLength());
        System.out.println("Current:");

        while(timepassed != endtime)
        {
            TimeUnit.SECONDS.sleep(1);
            timepassed=System.currentTimeMillis()-starttime;
            long secondspassed=timepassed/1000;
            if(secondspassed==60)
            {
                secondspassed=0;
                starttime=System.currentTimeMillis();
            }
            if((secondspassed%60)==0)
                displayMinutes++;

            System.out.println(displayMinutes+"::"+secondspassed);
        }

    }

    @Override
    public String toString(){
        String s = "";
        s += "Name: " + name + "\n";
        s += "Length: " + length + "\n";
        return s;
    }
}
