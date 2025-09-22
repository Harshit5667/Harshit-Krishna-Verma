import java.util.Scanner;
import java.util.Arrays;

public class Q4_NumberChecker {

    public static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int countDigits(int num) {
        return getDigits(num).length;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverse(digits);
        return Arrays.equals(digits, rev);
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digits.length);
        System.out.println("Reversed array: " + Arrays.toString(reverse(digits)));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));

        sc.close();
    }
}
