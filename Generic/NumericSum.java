package Generic;
import java.util.*;

public class NumericSum {

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;

        for (Number num : list) {
            sum += num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);

        List<Double> doubleList = Arrays.asList(2.5, 3.7, 1.8);

        System.out.println("Sum of Integer list: " + sumNumbers(intList));
        System.out.println("Sum of Double list: " + sumNumbers(doubleList));
    }
}

