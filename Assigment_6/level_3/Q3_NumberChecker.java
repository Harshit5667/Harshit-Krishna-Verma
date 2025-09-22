import java.util.Scanner;
import java.util.Arrays;

public class Q3_NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(num, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
        }

        sc.close();
    }
}
