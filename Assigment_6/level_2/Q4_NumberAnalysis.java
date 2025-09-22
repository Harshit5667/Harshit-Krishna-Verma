import java.util.Scanner;

public class Q4_NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (n >= 0) {
                if (n % 2 == 0) System.out.println(n + " is Positive and Even");
                else System.out.println(n + " is Positive and Odd");
            } else {
                System.out.println(n + " is Negative");
            }
        }

        if (arr[0] > arr[4]) System.out.println("First element is greater than last element");
        else if (arr[0] == arr[4]) System.out.println("First element is equal to last element");
        else System.out.println("First element is less than last element");

        sc.close();
    }
}
