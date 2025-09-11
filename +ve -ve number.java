// 4.Write a program to check whether a number is positive, negative, or zero.
// Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

import java.util.Scanner;
public class NumberCheck {
    // Method to check the number and return -1, 0, or 1
    public static int checkNumber(int num) {
        if (num > 0)
            return 1;      // Positive
        else if (num < 0)
            return -1;     // Negative
        else
            return 0;      // Zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking the number
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1)
            System.out.println(number + " is a Positive number.");
        else if (result == -1)
            System.out.println(number + " is a Negative number.");
        else
            System.out.println("The number is Zero.");

        sc.close();
    }
}
