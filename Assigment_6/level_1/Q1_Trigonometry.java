import java.util.Scanner;

public class Q1_Trigonometry {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double[] result = new double[3];
        result[0] = Math.sin(rad);
        result[1] = Math.cos(rad);
        result[2] = Math.tan(rad);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + res[0]);
        System.out.println("Cosine: " + res[1]);
        System.out.println("Tangent: " + res[2]);

        sc.close();
    }
}
