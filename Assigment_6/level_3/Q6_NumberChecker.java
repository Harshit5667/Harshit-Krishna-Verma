import java.util.Scanner;

public class Q6_NumberChecker {

    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int num) {
        return num > 0 && sumOfDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int num) {
        int sum = 0, n = num;
        while (n > 0) {
            int d = n % 10;
            sum += factorial(d);
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect Number? " + isPerfect(num));
        System.out.println("Abundant Number? " + isAbundant(num));
        System.out.println("Deficient Number? " + isDeficient(num));
        System.out.println("Strong Number? " + isStrong(num));

        sc.close();
    }
}
