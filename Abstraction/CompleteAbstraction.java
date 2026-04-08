// Write a Java program to demonstrate Complete Abstraction using an interface. Create an interface Animal with abstract methods. Implement the interface in a class Dog and display the output in the main class. //


interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats food");
    }
}

public class CompleteAbstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}