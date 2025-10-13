import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 20;

        // Function that returns length of string
        Function<String, Integer> getLength = msg -> msg.length();

        String message = "Functional Interfaces in Java";

        int length = getLength.apply(message);

        System.out.println("Message: \"" + message + "\"");
        System.out.println("Length: " + length);

        if (length > limit) {
            System.out.println("essage exceeds character limit (" + limit + ")");
        } else {
            System.out.println("Message is within limit");
        }
    }
}
