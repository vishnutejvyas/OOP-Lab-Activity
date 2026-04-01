class CalCulator { 

    public int add(int a, int b) {
        System.out.println("Base Calculator: Adding two numbers...");
        return a + b;
    }

    protected void display() {
        System.out.println("Message from Base Calculator.");
    }

    private void show() {
        System.out.println("This is a PRIVATE method in the Base Class.");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends CalCulator {
    
    @Override
    public int add(int a, int b) {
        System.out.println("Advanced Calculator: Performing a specialized addition...");
        return (a + b); 
    }

    @Override
    protected void display() {
        System.out.println("Message from Advanced Calculator (Overridden).");
    }

    // This is valid; it doesn't override the private method, it creates a new one
    public void show() {
        System.out.println("This is a UNIQUE show method in Advanced Calculator.");
    }
}

public class advCalc {
    public static void main(String[] args) {
        System.out.println("--- 1. Using Base Class Object ---");
        CalCulator basic = new CalCulator();
        System.out.println("Sum: " + basic.add(10, 5));
        basic.display();
        basic.accessPrivate();

        System.out.println("\n--- 2. Using Derived Class Object ---");
        AdvancedCalculator adv = new AdvancedCalculator();
        System.out.println("Sum: " + adv.add(10, 5));
        adv.display();
        adv.show(); 

        System.out.println("\n--- 3. Demonstrating Runtime Polymorphism ---");
        CalCulator polyObj = new AdvancedCalculator();
        System.out.println("Sum: " + polyObj.add(10, 5)); 
        polyObj.display();
    }
}
