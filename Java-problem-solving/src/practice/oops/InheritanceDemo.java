package practice.oops;

// Parent Class
class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Beep, beep!");
    }
}

// Child Class inheriting from Vehicle
class Car extends Vehicle {
    private String modelName = "Mustang";

    public void displayDetails() {
        System.out.println("Brand: " + brand + " | Model: " + modelName);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();          // Call inherited method from Vehicle
        myCar.displayDetails(); // Call Car-specific method
    }
}
