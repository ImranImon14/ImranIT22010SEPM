interface Vehicle {
    void move();
}

class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.move();
    }
}
