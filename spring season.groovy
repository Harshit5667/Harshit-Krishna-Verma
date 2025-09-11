//5. Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

import java.util.Scanner;
public class SpringSeason {

    // Method to check if the given month and day are in Spring Season
    public static boolean isSpring(int month, int day) {
        // Spring Season ranges from:
        // March 20 to March 31, April 1 to April 30,
        // May 1 to May 31, and June 1 to June 20
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) || 
            (month == 5 && day >= 1 && day <= 31) || 
            (month == 6 && day >= 1 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Check if the user has given both month and day as command line arguments
        if (args.length < 2) {
            System.out.println("Please enter month and day as command line arguments.");
            System.out.println("Example: java SpringSeason 3 21");
            return; // Stop the program if arguments are missing
        }

        // Convert command line arguments (Strings) into integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call the method to check if it's spring
        boolean result = isSpring(month, day);

        // Print the result in a friendly way
        if (result) {
            System.out.println("It's a Spring Season 🌸");
        } else {
            System.out.println("Not a Spring Season 🍂");
        }
    }
}
