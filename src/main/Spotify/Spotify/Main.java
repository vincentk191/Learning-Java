package Spotify;

import java.util.ArrayList;
import java.util.Scanner;
import helper.printing;
import helper.fetchInput;

public class Main {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Spotify spotify = new Spotify();
        ArrayList<Song> songs = spotify.getSongs();
        ArrayList<Playlist> playlists = spotify.getPlaylists();

        System.out.println("Please enter an option: ");

        int option = 0;

        while (option != 6) {
            printing.printOptions();
            option = fetchInput.userInput(input);
            switch(option){
                case 1: // List all songs
                    System.out.println("Listing all songs");
                    if(songs == null){
                        System.out.println("No Songs currently present");
                    } else {
                        for(Song s: songs) {
                            s.toString();
                        }
                    }
                break;
                case 2: // List songs in playlist
                    System.out.println("Listing all songs in playlist");
                    if(playlists == null){
                        System.out.println("No Playlist currently present");
                    } else {
                        for(Playlist p: playlists) {
                            if (p.getPlaylist() == null){
                                System.out.println("---------------");
                            } else {
                                for(Track t: p.getPlaylist()){
                                    if(t instanceof Song){
                                        t.toString();
                                        System.out.println("---------");
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 3: // Add a playlist
                    System.out.print("Name: ");
                    String name = input.next();
                    Playlist playlist = new Playlist(new ArrayList<Track>(0), name);
//                    playlists.add(playlist);

                    System.out.println("Playlist \"" + name + "\" created!");
                    playlists.toString();
                    break;
                case 4: // Add song to playlist
                    System.out.println("Name of playlist: ");
                    System.out.println("Song \n---------------");
                    System.out.println("Name: ");
                    System.out.println("Artist: ");
                    System.out.println("Album: ");
                    System.out.println("Length: ");
                    break;
                case 5: // Remove song
                    break;
                case 6: // Exit
                    System.out.println("Thank you for playing!");
                    return;
                case -2: // IOException
                    System.out.println("Please restart the program.");
                    return;
            }
        }


    }


}
