package Generic;

import java.util.*;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof! 🐶");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow! 🐱");
    }
}

public class AnimalHierarchy {

    public static void printAnimals(List<? extends Animal> animals) {
        System.out.println("Animals in the list:");

        for (Animal a : animals) {
            System.out.println("- " + a);
            a.makeSound();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());

        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        printAnimals(dogs);
        printAnimals(cats);
    }
}

