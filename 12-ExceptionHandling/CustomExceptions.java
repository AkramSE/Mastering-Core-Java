import java.util.Scanner;

/**
 * Demonstration of Custom Exceptions, the 'throw' keyword,
 * and the 'throws' keyword with dynamic User Input.
 */

// 1. Creating a Custom Exception Class
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Exception: Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Make sure the radius entered is greater than or equal to 0.";
    }
}

public class CustomExceptions {

    // 2. Using 'throws' to warn whoever uses this method
    public static double calculateArea(int r) throws NegativeRadiusException {
        if (r < 0) {
            // 3. Using 'throw' to manually trigger the custom exception
            throw new NegativeRadiusException(); 
        }
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Circle Area Calculator (Exception Handling Demo) ---");

        try {
            // Taking dynamic input from the user
            System.out.print("Enter the radius of the circle: ");
            int radius = sc.nextInt();
            
            System.out.println("Attempting to calculate area with radius " + radius + "...");
            double area = calculateArea(radius);
            
            // Using printf to format the double value to 2 decimal places
            System.out.printf("✅ Success! Area of the circle is: %.2f\n", area);
            
        } catch (NegativeRadiusException e) {
            System.out.println("\n❌ Custom Exception Caught!");
            System.out.println("Message: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
        } catch (Exception e) {
            // This will catch errors if the user types letters like "abc" instead of a number
            System.out.println("\n❌ Invalid Input! Please enter a valid integer number.");
        } finally {
            System.out.println("\nEnd of the program. Handled gracefully!");
        }
    }
}
