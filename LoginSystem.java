import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String validAdmin = "username";
        String validPass = "pass123";

        int attempts = 0;
        int maxAttempts = 3;
        boolean accessGranted = false;

        System.out.println("System Secure Login ");

        
        while (attempts < maxAttempts) {
            System.out.print("Enter Username: ");
            String inputUser = scanner.nextLine();

            System.out.print("Enter Password: ");
            String inputPass = scanner.nextLine();

            
            if (inputUser.equals(validAdmin) && inputPass.equals(validPass)) {
                accessGranted = true;
                break; 
            } else {
                attempts++;
                int remaining = maxAttempts - attempts;
                
                if (remaining > 0) {
                    System.out.println("Invalid credentials. Please try again.");
                    System.out.println("Attempts remaining: " + remaining);
                    System.out.println("--------------------------");
                }
            }
        }

        // Final status check
        if (accessGranted) {
            System.out.println("Login Successful! Welcome to the dashboard.");
        } else {
            System.out.println("Access Denied: Account locked after 3 failed attempts.");
            System.out.println("Please contact your administrator.");
        }

        scanner.close();
    }
}