class Prototype implements Cloneable {
    String model;

    public Prototype(String model) {
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public String toString() {
        return "Prototype{model='" + model + "'}";
    }
}

public class CloneDemo {
    public static void main(String[] args) {
        Prototype original = new Prototype("CarModelX");

        try {
            Prototype copy = (Prototype) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + copy);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }
    }
}
