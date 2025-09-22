import java.util.Arrays;
import java.util.Scanner;

class KthMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(k + " Min = " + arr[k-1]);
        System.out.println(k + " Max = " + arr[arr.length-k]);

        sc.close();
    }
}
