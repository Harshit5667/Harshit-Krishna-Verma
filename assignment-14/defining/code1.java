// Interface definition
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light class implementing SmartDevice
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }
    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

// AC class implementing SmartDevice
class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is now running");
    }
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

// TV class implementing SmartDevice
class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

// Main class to test
public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
