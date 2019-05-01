package helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fetchInput {
    public static int userInput (Scanner input){
        int option = 0;

        try {
            option = input.nextInt();

            if (option <= 6 && option > 0) {
                return option;
            } else {
                System.out.println("Option is out of bounds, please try again.");
                return -1;

            }
        } catch (InputMismatchException e){
            System.out.println("Invalid input");
            return -2;
        }
    }
}
