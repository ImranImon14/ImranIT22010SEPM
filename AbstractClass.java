abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}
