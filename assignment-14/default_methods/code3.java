interface Vehicle {
    void displaySpeed();

    // New default feature
    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed: 60 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 75% charged");
    }
}

public class VehicleDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
