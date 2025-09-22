import java.util.Scanner;

public class Q5_FriendsAnalysis {

    public static String findYoungest(String[] names, int[] ages) {
        int min = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    public static String findTallest(String[] names, double[] heights) {
        double max = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + findYoungest(names, ages));
        System.out.println("Tallest: " + findTallest(names, heights));

        sc.close();
    }
}

