import java.time.*;

public class P4 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2025, 9, 19);
        LocalDate d2 = LocalDate.of(2025, 12, 25);

        if (d1.isBefore(d2)) {
            System.out.println(d1 + " is before " + d2);
        } else if (d1.isAfter(d2)) {
            System.out.println(d1 + " is after " + d2);
        } else {
            System.out.println(d1 + " is equal to " + d2);
        }
    }
}
