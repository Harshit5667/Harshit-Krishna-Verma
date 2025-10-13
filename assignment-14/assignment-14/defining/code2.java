// Interface definition
interface Rentable {
    void rent();
    void returnVehicle();
}

// Car class
class Car implements Rentable {
    public void rent() {
        System.out.println("Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

// Bike class
class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

// Bus class
class Bus implements Rentable {
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

// Main class
public class VehicleRentalDemo {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
