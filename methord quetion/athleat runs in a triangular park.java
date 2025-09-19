// 3.An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => 
// Take user input for 3 sides of a triangle 
// The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// Write a Method to compute the number of rounds user needs to do to complete 5km run


import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;      // in meters
        double totalDistance = 5000;                   // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for triangle sides
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculating rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Displaying result (formatted to 2 decimal places)
        System.out.printf("The athlete must complete %.2f rounds to run 5 km.%n", rounds);

        sc.close();
    }
}