package Spotify;

import java.util.Scanner;
import helper.printing;
import helper.fetchInput;

public class Spotify {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an option: ");
        printing.printOptions();

        int option = fetchInput.userInput(input);

        while (option == -1) {
            printing.printOptions();
            option = fetchInput.userInput(input);
        }

        switch(option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case -2:
                System.out.println("Please restart the program.");
                break;
        }

        System.out.println("Thank you for playing!");
    }


}
