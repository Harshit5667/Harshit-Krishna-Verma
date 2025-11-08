package Generic;

public class CompareTwoValues {

    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        System.out.println("Are 10 and 10 equal? " + isEqual(10, 10));

        System.out.println("Are 'Java' and 'Python' equal? " + isEqual("Java", "Python"));

        System.out.println("Are 12.5 and 12.5 equal? " + isEqual(12.5, 12.5));

        System.out.println("Are 'A' and 'B' equal? " + isEqual('A', 'B'));
    }
}

