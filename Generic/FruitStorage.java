package Generic;

import java.util.ArrayList;
import java.util.List;

// 🫐 Base class: Fruit
class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        System.out.println("Fruits in the box: " + fruits);
    }
}

class Car {
    public String toString() {
        return "Car";
    }
}

public class FruitStorage {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.addFruit(new Mango());

        appleBox.displayFruits();
        mangoBox.displayFruits();

    }
}

