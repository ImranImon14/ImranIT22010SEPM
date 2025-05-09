interface Engine {
    void startEngine();

    void stopEngine();
}

abstract class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void drive();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle implements Engine {

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    void drive() {
        System.out.println("Driving a car.");
    }
}

class Bike extends Vehicle implements Engine {

    public Bike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    void drive() {
        System.out.println("Riding a bike.");
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        Vehicle car = new Car("Mercedes Benz", 2022);
        car.displayInfo();
        ((Engine) car).startEngine();
        car.drive();
        ((Engine) car).stopEngine();

        System.out.println();

        Vehicle bike = new Bike("Suzuki Gixxer", 2023);
        bike.displayInfo();
        ((Engine) bike).startEngine();
        bike.drive();
        ((Engine) bike).stopEngine();
    }
}
