import java.util.Random;

public class Q1_FootballTeamHeights {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Player heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
        System.out.println("Mean height: " + mean(heights));
    }
}
