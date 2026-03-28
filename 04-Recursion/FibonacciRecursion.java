import java.util.Scanner;

/**
 * Finding the Nth term of the Fibonacci series using Recursion.
 * Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
 */
public class FibonacciRecursion {
    
    static int fib(int n) {
        // Base conditions for the 1st and 2nd terms
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } 
        /* Short way to write base condition:
           if(n == 1 || n == 2) { return n - 1; }
        */
        else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- > Fibonacci Sequence Finder <---");
        System.out.print("Enter the term number you want to find: ");
        int a = sc.nextInt();
        
        System.out.println("The Fibonacci value at term " + a + " is " + fib(a));
    }
}
