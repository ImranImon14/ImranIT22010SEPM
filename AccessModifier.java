class Laptop {
    private String name;  // acces only within the class
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setName("Lenovo");
        System.out.println(l.getName());
    }
}