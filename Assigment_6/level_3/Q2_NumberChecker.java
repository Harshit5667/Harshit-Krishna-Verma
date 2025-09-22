import java.util.Scanner;
import java.util.Arrays;

public class Q2_NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int n = digits.length, sum = 0, original = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
            original = original * 10 + d;
        }
        return sum == original;
    }

    public static void largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) { second = largest; largest = d; }
            else if (d > second && d != largest) second = d;
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + second);
    }

    public static void smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) { second = smallest; smallest = d; }
            else if (d < second && d != smallest) second = d;
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(digits));
        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);

        sc.close();
    }
}
