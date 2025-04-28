class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
        System.out.println("Color:"+color);
        System.out.println("Speed:"+speed);
    }
}

public class ClassObj {
    public static void main(String[] args) {
        Car myCar = new Car(); // object creation
        myCar.color = "Black";
        myCar.speed = 200;
        myCar.drive();
    }
}