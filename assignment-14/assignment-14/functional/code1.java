import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        double threshold = 40.0;

        // Predicate checks whether temperature > threshold
        Predicate<Double> highTempAlert = temp -> temp > threshold;

        double currentTemp = 42.5;

        if (highTempAlert.test(currentTemp)) {
            System.out.println("lert: Temperature crossed threshold! Current: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature is normal: " + currentTemp + "°C");
        }
    }
}
