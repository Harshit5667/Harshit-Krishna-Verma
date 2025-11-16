import java.util.*;

public class LibraryCatalog {

    public static void main(String[] args) {

        Map<String, String> books = new HashMap<>();

        books.put("978-1111111111", "Data Structures in Java");
        books.put("978-2222222222", "Operating Systems Concepts");
        books.put("978-3333333333", "Introduction to Algorithms");
        books.put("978-4444444444", "Clean Code");

        searchByISBN(books, "978-3333333333");
        searchByISBN(books, "978-0000000000");

        searchByTitle(books, "Operating Systems Concepts");
        searchByTitle(books, "Unknown Title");
    }

    public static void searchByISBN(Map<String, String> books, String isbn) {
        if (books.containsKey(isbn)) {
            System.out.println("Found: " + isbn + " → " + books.get(isbn));
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void searchByTitle(Map<String, String> books, String title) {
        boolean found = false;

        for (Map.Entry<String, String> entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found: " + entry.getKey() + " → " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Title not found.");
        }
    }
}
