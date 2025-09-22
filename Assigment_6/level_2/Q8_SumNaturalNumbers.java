import java.util.Scanner;

public class Q8_SumNaturalNumbers {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number must be a natural number (>0).");
        } else {
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);

            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumForm);

            if (sumRec == sumForm) System.out.println("Both results are equal. Correct!");
            else System.out.println("Results do not match. Something is wrong.");
        }

        sc.close();
    }
}
