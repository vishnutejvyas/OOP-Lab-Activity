class InvoiceProcessor {

 
    public void generateInvoice(String customerName, double amount) {
        System.out.println("--- Standard Invoice ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Base Amount: $" + amount);
                double tax = calculateTax(amount);
        System.out.println("Tax Applied: $" + tax);
        System.out.println("Total: $" + (amount + tax));
    }


    private double calculateTax(double amount) {
        return amount * 0.10; // Standard 10% tax
    }

    public void runInternalAudit(double amount) {
        System.out.println("Internal Audit Log: Tax for $" + amount + " is $" + calculateTax(amount));
    }
}


class RetailInvoice extends InvoiceProcessor {

 
    @Override
    public void generateInvoice(String customerName, double amount) {
        System.out.println("--- Retail Store Invoice (Modified) ---");

        double discount = amount * 0.05;
        double discountedAmount = amount - discount;
        
        System.out.println("Customer: " + customerName);
        System.out.println("Original: $" + amount);
        System.out.println("Retail Discount (5%): -$" + discount);
        System.out.println("Final Retail Total: $" + discountedAmount);
        System.out.println("Note: Retail tax is handled at the counter.");
    }

 
 
    public String calculateTax(double amount) {
        return "Retail tax is calculated differently!";
    }
}

public class myInvoice {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Standard Object Behavior ===");
        InvoiceProcessor basicInv = new InvoiceProcessor();
        basicInv.generateInvoice("John Doe", 100.0);

        System.out.println("\n=== 2. Runtime Polymorphism ===");
       
        InvoiceProcessor retailInv = new RetailInvoice();

        
        retailInv.generateInvoice("Alice Smith", 200.0);

        System.out.println("\n=== 3. Private Method Security ===");
 
        retailInv.runInternalAudit(200.0);
        
   
    }
}