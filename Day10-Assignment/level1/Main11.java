interface Refuelable {
    void refuel();
}

class Vehicle2 {
    int maxSpeed;
    String model;
    Vehicle2(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle2 {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println("Electric Vehicle " + model + " is charging");
    }
}

class PetrolVehicle extends Vehicle2 implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println("Petrol Vehicle " + model + " is refueling");
    }
}

public class Main11 {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota");
        ev.charge();
        pv.refuel();
    }
}
