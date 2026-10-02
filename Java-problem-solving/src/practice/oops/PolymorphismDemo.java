package practice.oops;


// 1. Compile-Time Polymorphism (Method Overloading)
class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
}

// 2. Runtime Polymorphism (Method Overriding)
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Overloading Demo
        Calculator calc = new Calculator();
        System.out.println("Sum (2 ints): " + calc.add(5, 10));
        System.out.println("Sum (2 doubles): " + calc.add(5.5, 2.3));

        // Overriding Demo
        Animal myPet = new Dog(); // Dynamic Method Dispatch
        myPet.makeSound();        // Executes Dog's overridden method
    }
}