import java.util.Scanner;

public class Q4_QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();

        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + res[0]);
        System.out.println("Remainder: " + res[1]);

        sc.close();
    }
}
