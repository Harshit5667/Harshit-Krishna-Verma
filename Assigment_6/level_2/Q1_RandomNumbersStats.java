import java.util.Arrays;

public class Q1_RandomNumbersStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) a[i] = (int)(Math.random()*9000)+1000;
        return a;
    }

    public static double[] findAverageMinMax(int[] a) {
        int min = a[0], max = a[0], sum = 0;
        for (int n : a) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum/a.length, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(nums));
        double[] stats = findAverageMinMax(nums);
        System.out.println("Average: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }
}
