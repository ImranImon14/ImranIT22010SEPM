class Animal {
    protected String type = "Fox";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(type + " says woooooof!");
    }
}

public class InheritanceAndProteced {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.bark();
    }
}