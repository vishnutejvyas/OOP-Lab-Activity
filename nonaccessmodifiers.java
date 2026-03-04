abstract class Animal {          // abstract class

    // static variable
    static String category = "Living Being";

    // final variable
    final int legs = 4;

    // abstract method
    abstract void sound();

    // normal method
    void display() {
        System.out.println("Animals are " + category);
    }

    // static method
    static void info() {
        System.out.println("This is a static method inside abstract class");
    }
}

// child class
class Dog extends Animal {

    // implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class nonaccessmodifiers {

    public static void main(String[] args) {

        Dog d = new Dog();

        // calling abstract method implementation
        d.sound();

        // calling normal method
        d.display();

        // accessing final variable
        System.out.println("Dog has " + d.legs + " legs");

        // calling static method
        Animal.info();

        // accessing static variable
        System.out.println("Category: " + Animal.category);
    }
}