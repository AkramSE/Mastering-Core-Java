import java.util.Scanner;

/**
 * Introduction to Recursion in Java.
 * Contains classic examples: Factorial and Sum of First N Natural Numbers.
 */
public class RecursionBasics {
    
    // 1. Recursive method for Factorial
    /* Step-by-step calculation of factorial(4):
       factorial(4) = 4 * factorial(3); 
       factorial(4) = 4 * 3 * factorial(2); 
       factorial(4) = 4 * 3 * 2 * factorial(1); 
       factorial(4) = 4 * 3 * 2 * 1; 
       factorial(4) = 24; 
    */ 
    static int factorial(int n) {
        // Base condition
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // 2. Recursive method for Sum of N natural numbers
    /*
       sum(3) = 3 + sum(2) 
       sum(3) = 3 + 2 + sum(1) 
       sum(3) = 3 + 2 + 1 = 6
    */
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--->1. Factorial Calculator<---");
        System.out.print("Enter a number to find its factorial: ");
        int a = sc.nextInt();
        System.out.println("The factorial of " + a + " is " + factorial(a));
        
        System.out.println("\n--->2. Sum of N Natural Numbers <---");
        System.out.print("Enter a number to find its sum: ");
        int b = sc.nextInt();
        System.out.println("The sum of first " + b + " natural numbers is " + sumRec(b)); 
    }
}
