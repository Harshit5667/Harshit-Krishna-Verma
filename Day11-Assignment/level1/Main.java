import java.util.*;

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    Library(String name) {
        this.name = name;
    }
    void addBook(Book book) {
        books.add(book);
    }
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe");
        Book b2 = new Book("OOP Concepts", "Jane Smith");
        Library l1 = new Library("City Library");
        Library l2 = new Library("School Library");
        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b1);
        l1.showBooks();
        l2.showBooks();
    }
}
