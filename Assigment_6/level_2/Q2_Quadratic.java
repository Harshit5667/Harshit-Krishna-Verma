import java.util.Scanner;

public class Q2_Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4*a*c;
        if (delta < 0) return new double[]{};
        if (delta == 0) return new double[]{-b/(2*a)};
        return new double[]{(-b + Math.sqrt(delta))/(2*a), (-b - Math.sqrt(delta))/(2*a)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots");
        else if (roots.length == 1) System.out.println("Root: " + roots[0]);
        else System.out.println("Roots: " + roots[0] + ", " + roots[1]);

        sc.close();
    }
}
