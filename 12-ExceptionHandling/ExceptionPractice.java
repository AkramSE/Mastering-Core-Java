import java.util.Scanner;

/**
 * Practice Set on Exceptions.
 * Real-world logic: Allowing the user a maximum of 5 attempts to enter a valid input.
 */
public class ExceptionPractice {
    public static void main(String[] args) {
        int[] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;
        int i = 0; // Attempt counter
        int maxRetries = 5;

        System.out.println("---> Secure Array Access System <---");
        System.out.println("You have a maximum of " + maxRetries + " attempts to enter a valid index.");

        while (flag && i < maxRetries) {
            try {
                System.out.print("\nAttempt " + (i + 1) + " - Enter the value of index: ");
                int index = sc.nextInt();
                
                System.out.println("✅ Success! The value of marks[" + index + "] is: " + marks[index]);
                break; // Exit the loop if successful
            } 
            catch (Exception e) {
                System.out.println("❌ Invalid Index! Please try again.");
                i++;
            }
        }

        if (i >= maxRetries) {
            System.out.println("\n🚨 ERROR: Maximum retry limit reached. System locked!");
        }

    }
}
