package Generic;
import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println(item + " added to the cart.");
    }

    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from the cart.");
        } else {
            System.out.println(item + " not found in the cart.");
        }
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (T item : items) {
                System.out.println("- " + item);
            }
        }
        System.out.println();
    }
}

class Electronics {
    private String name;

    Electronics(String name) {
        this.name = name;
    }

    public String toString() {
        return "Electronics: " + name;
    }
}

class Clothing {
    private String name;

    Clothing(String name) {
        this.name = name;
    }

    public String toString() {
        return "Clothing: " + name;
    }
}

class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return "Book: " + title;
    }
}

public class GenericCart {
    public static void main(String[] args) {

        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Smartphone"));
        electronicsCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));
        clothingCart.displayItems();

        Cart<Book> bookCart = new Cart<>();
        bookCart.addItem(new Book("The Alchemist"));
        bookCart.addItem(new Book("Atomic Habits"));
        bookCart.displayItems();

    }
}

