import java.util.*;

public class InventoryManagement {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Soap", 50);
        inventory.put("Shampoo", 30);
        inventory.put("Rice", 100);

        sellProduct(inventory, "Soap", 20);
        sellProduct(inventory, "Shampoo", 30);

        restockProduct(inventory, "Shampoo", 40);
        restockProduct(inventory, "Rice", 50);

        queryProduct(inventory, "Rice");
        queryProduct(inventory, "Bread");

        System.out.println("Out of stock: " + getOutOfStockProducts(inventory));
    }

    public static void sellProduct(Map<String, Integer> inventory, String product, int quantity) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " not stocked");
            return;
        }

        int updated = inventory.get(product) - quantity;

        if (updated <= 0) {
            inventory.put(product, 0);
            System.out.println(product + " is now OUT OF STOCK");
        } else {
            inventory.put(product, updated);
            System.out.println("Sold! New quantity of " + product + ": " + updated);
        }
    }

    public static void restockProduct(Map<String, Integer> inventory, String product, int quantity) {
        int current = inventory.getOrDefault(product, 0);
        inventory.put(product, current + quantity);
        System.out.println("Restocked " + product + ": " + (current + quantity));
    }

    public static void queryProduct(Map<String, Integer> inventory, String product) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " not stocked");
        } else {
            System.out.println(product + " → " + inventory.get(product));
        }
    }

    public static List<String> getOutOfStockProducts(Map<String, Integer> inventory) {
        List<String> out = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                out.add(entry.getKey());
            }
        }
        return out;
    }
}
