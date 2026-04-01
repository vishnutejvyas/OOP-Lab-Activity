class Notifier {

  
    public void send(String message) {
        System.out.println("General Alert: " + message);
    }

  
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

  
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }


    private void sendInternalLog(String logInfo) {
        System.out.println("[INTERNAL SYSTEM LOG]: " + logInfo);
    }


    public void triggerSystemLog(String activity) {
        System.out.println("Requesting internal log...");
        sendInternalLog("User performed: " + activity);
    }
}

class AppNotifier extends Notifier {
    

    public void performAllNotifications() {
        System.out.println("--- AppNotifier starting batch tasks ---");
        
 
        send("Welcome to the App!");


        send("Your OTP is 1234", "user@example.com");

  
        send("Don't forget your meeting", 9876543210L);


        triggerSystemLog("Batch Notification");
    }
}

public class myNotifier {
    public static void main(String[] args) {
        
        AppNotifier myApp = new AppNotifier();

     
        System.out.println("--- Testing Overloaded Methods ---");
        myApp.send("System Update available."); // Calls version with 1 String
        myApp.send("Invoice attached", "billing@store.com"); // Calls version with 2 Strings
        myApp.send("Your delivery is arriving", 8889991111L); // Calls version with String + long

        System.out.println("\n--- Testing Indirect Private Access ---");
        myApp.triggerSystemLog("Main Menu Navigation");
       
        System.out.println("\n--- Running Subclass Internal Logic ---");
        myApp.performAllNotifications();
    }
}