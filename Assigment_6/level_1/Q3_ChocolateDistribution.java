import java.util.Scanner;

public class Q3_ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  
        result[1] = number % divisor;  
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Chocolates per child: " + res[0]);
        System.out.println("Remaining chocolates: " + res[1]