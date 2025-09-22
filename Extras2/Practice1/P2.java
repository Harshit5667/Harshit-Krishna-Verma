import java.time.*;

public class P2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 9, 19);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Final Date: " + result);
    }
}
