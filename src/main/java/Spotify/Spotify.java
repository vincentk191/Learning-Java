package Spotify;

import java.util.Scanner;
import helper.printing;
import helper.fetchInput;

public class Spotify {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an option: ");

        int option = 0;

        while (option != 6) {
            printing.printOptions();
            option = fetchInput.userInput(input);
            switch(option){
                case 1:
                    System.out.println("Listing all songs");
                    break;
                case 2:
                    System.out.println("Listing all songs in playlist");
                    break;
                case 3:
                    System.out.println("Added playlist");
                    break;
                case 4:
                    System.out.println("Added song to playlist");
                    break;
                case 5:
                    System.out.println("Removed song");
                    break;
                case 6:
                    System.out.println("Thank you for playing!");
                    return;
                case -2:
                    System.out.println("Please restart the program.");
                    return;
            }
        }


    }


}
