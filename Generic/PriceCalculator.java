package Generic;

import java.util.*;

class Product {
    private double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return getClass().getSimpleName() + " (₹" + price + ")";
    }
}

class Mobile extends Product {
    private String brand;

    Mobile(String brand, double price) {
        super(price);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile [" + brand + "] - ₹" + getPrice();
    }
}

class Laptop extends Product {
    private String model;

    Laptop(String model, double price) {
        super(price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop [" + model + "] - ₹" + getPrice();
    }
}

public class PriceCalculator {

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;

        for (Product item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(
                new Mobile("Samsung", 25000),
                new Mobile("iPhone", 70000),
                new Mobile("OnePlus", 45000)
        );

        List<Laptop> laptops = Arrays.asList(
                new Laptop("HP Pavilion", 55000),
                new Laptop("MacBook Air", 120000)
        );

        double mobileTotal = calculateTotal(mobiles);
        double laptopTotal = calculateTotal(laptops);

        // 🧾 Display results
        System.out.println("Mobiles:");
        mobiles.forEach(System.out::println);
        System.out.println("Total Mobile Price: ₹" + mobileTotal);
        System.out.println();

        System.out.println("Laptops:");
        laptops.forEach(System.out::println);
        System.out.println("Total Laptop Price: ₹" + laptopTotal);
    }
}

