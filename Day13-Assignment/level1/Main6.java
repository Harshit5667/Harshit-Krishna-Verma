interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * (percent / 100);
    }

    public String getDiscountDetails() {
        return "Veg Discount: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 20 - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * (percent / 100);
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount;
    }
}

public class Main6 {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 150, 2);
        FoodItem f2 = new NonVegItem("Chicken", 250, 1);

        FoodItem[] items = {f1, f2};

        for (FoodItem item : items) {
            item.getItemDetails();
            Discountable d = (Discountable)item;
            d.applyDiscount(10);
            System.out.println(d.getDiscountDetails());
            System.out.println("Final Price: " + item.calculateTotalPrice());
        }
    }
}
