import java.util.Scanner;

public class Spotify {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int option = 0;

        System.out.println("Please enter an option: ");
        while (option != 6) {
            System.out.println("------------------------------------------");
            System.out.println("    1: List all songs currently added");
            System.out.println("    2: List all songs in a playlist");
            System.out.println("    3: Add a playlist");
            System.out.println("    4: Add a song to playlist");
            System.out.println("    5: Remove song/playlist");
            System.out.println("    6: Exit Program");
            System.out.println("------------------------------------------");
            option = input.nextInt();

            if (option > 6 || option < 0) {
                System.out.println("Invalid option, please try again.");
            }
        }

        System.out.println("Thank you for playing!");
    }
}
