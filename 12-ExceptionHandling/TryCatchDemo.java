import java.util.Scanner;

/**
 * Demonstration of Try-Catch blocks, handling Specific Exceptions,
 * and Nested Try-Catch blocks.
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        int[] marks = {7, 56, 6}; // Array of size 3 (Indexes: 0, 1, 2)
        Scanner sc = new Scanner(System.in);

        System.out.println("---> Exception Handling Demo <---");
        System.out.print("Enter the array index you want to access: ");
        int ind = sc.nextInt();

        System.out.print("Enter a number to divide the array value with: ");
        int number = sc.nextInt();

        // NESTED TRY-CATCH & MULTIPLE CATCH BLOCKS
        try {
            System.out.println("\nWelcome to Level 1 Try block!");
            
            try {
                System.out.println("Accessing Level 2...");
                System.out.println("Value at array index " + ind + " is: " + marks[ind]);
                System.out.println("Result of division: " + (marks[ind] / number));
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("❌ Level 2 Error: Invalid Array Index! Does not exist.");
                System.out.println(e);
            } 
            catch (ArithmeticException e) {
                System.out.println("❌ Level 2 Error: Arithmetic Exception! Cannot divide by zero.");
                System.out.println(e);
            }
        } 
        catch (Exception e) {
            System.out.println("❌ Level 1 Error: Some other broad exception occurred!");
            System.out.println(e);
        }

        System.out.println("\n✅ Program finished gracefully without crashing!");
    }
}
