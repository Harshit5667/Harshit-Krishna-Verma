import java.util.*;

class Product {
    String name;
    double pricePerUnit;
    double quantity;
    Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }
    double getTotal() {
        return pricePerUnit * quantity;
    }
}

class Customer {
    String name;
    List<Product> products = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }
    void addProduct(Product p) {
        products.add(p);
    }
    List<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    double generateBill(Customer c) {
        double total = 0;
        for (Product p : c.getProducts()) {
            total += p.getTotal();
        }
        return total;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        c1.addProduct(new Product("Apples", 3, 2));
        c1.addProduct(new Product("Milk", 2, 1));
        BillGenerator bg = new BillGenerator();
        double total = bg.generateBill(c1);
        System.out.println("Customer: " + c1.name + " Total Bill: $" + total);
    }
}
