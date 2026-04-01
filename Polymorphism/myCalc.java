class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void displayDecimalAddition(double a, double b) {
        double result = add(a, b); // Calling the private method
        System.out.println("Sum of decimals " + a + " and " + b + " is: " + result);
    }
}

public class myCalc {
    public static void main(String[] args) {
      
        Calculator myCalc = new Calculator();

        int sum1 = myCalc.add(10, 20);
        System.out.println("Sum of 2 integers: " + sum1);

        int sum2 = myCalc.add(5, 15, 25);
        System.out.println("Sum of 3 integers: " + sum2);

        myCalc.displayDecimalAddition(12.5, 7.3);
    }
}