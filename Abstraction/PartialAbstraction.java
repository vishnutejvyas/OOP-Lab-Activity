// Write a Java program to demonstrate Partial Abstraction using an abstract class. Create an abstract class Vehicle with one abstract method and one normal method. Create a subclass Car that implements the abstract method and display the details in the main class. //

abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class PartialAbstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuel();
    }
}