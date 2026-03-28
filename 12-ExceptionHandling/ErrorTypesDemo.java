import java.util.Scanner;

/**
 * Demonstration of Syntax, Logical, and Runtime Errors in Java.
 */
public class ErrorTypesDemo {
    public static void main(String[] args) {
        
        System.out.println("---> 1. SYNTAX ERRORS (Compile-time) <---");
        // Syntax errors occur when Java rules are violated. Code won't compile.
        // int a = 0 // Error: No semicolon!
        // b = 8;    // Error: Variable 'b' not declared!
        System.out.println("Syntax errors are commented out to allow compilation.");

        System.out.println("\n---> 2. LOGICAL ERRORS (Bugs) <---");
        // Logical errors: Code runs, but gives the wrong output.
        // Example: Trying to print prime numbers, but printing odd numbers instead.
        System.out.println("Printing what we think are prime numbers:");
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1); // Logical Error: 9 is not prime!
        }

        System.out.println("\n---> 3. RUNTIME ERRORS (Exceptions) <---");
        // Runtime errors: Code compiles, but crashes during execution.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to divide 1000 by (Try entering 0 to see a runtime error): ");
        int k = sc.nextInt();
        
        // If user enters 0, this will throw an ArithmeticException and crash!
        System.out.println("Result: " + (1000 / k)); 
        
    }
}
