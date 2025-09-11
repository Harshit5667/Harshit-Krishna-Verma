// 11.Write a program to calculate various trigonometric functions using Math class given an angle in degrees
// Hint => 
// Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)

// import java.util.Scanner;

public class TrigonometryCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking angle input from user
        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        // Getting trigonometric results
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying results
        System.out.printf("For angle %.2f°:%n", angle);
        System.out.printf("Sine = %.4f%n", results[0]);
        System.out.printf("Cosine = %.4f%n", results[1]);
        System.out.printf("Tangent = %.4f%n", results[2]);

        sc.close();
    }
}
