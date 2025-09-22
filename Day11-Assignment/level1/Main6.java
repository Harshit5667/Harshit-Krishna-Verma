import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void showProduct() {
        System.out.println("Product: " + name + " Price: " + price);
    }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();
    Order(int orderId) {
        this.orderId = orderId;
    }
    void addProduct(Product p) {
        products.add(p);
    }
    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        orders.add(o);
    }
    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Phone", 500);
        Product p3 = new Product("Tablet", 300);
        Order o1 = new Order(101);
        Order o2 = new Order(102);
        o1.addProduct(p1);
        o1.addProduct(p2);
        o2.addProduct(p3);
        c1.placeOrder(o1);
        c2.placeOrder(o2);
        c1.showOrders();
        c2.showOrders();
    }
}
