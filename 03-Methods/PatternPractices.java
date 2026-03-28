/**
 * Practical exercises using Methods.
 * Includes printing multiplication tables and star patterns.
 */
public class PatternPractices {
    
    // 1. Method to print Multiplication Table
    static void multiplication(int n) {
        System.out.println("---> Multiplication Table of " + n + " <---");
        for (int a = 1; a <= 10; a++) {
            System.out.format("%d x %d = %d\n", n, a, n * a); 
        }
    }
    
    // 2. Method to print a Left-Aligned Star Pattern
    static void leftPattern(int n) {
        System.out.println("\n--->Left-Aligned Pattern <---");
        for (int a = 0; a < n; a++) {
            for (int e = 0; e < a + 1; e++) {
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
    }

    // 3. Method to print a Pyramid Star Pattern
    static void pyramidPattern(int n) {
        System.out.println("\n--->Pyramid Pattern<---");
        for (int a = 0; a < n; a++) { 
            // Loop for spaces
            for (int k = n - a; k >= 0; k--) {
                System.out.print(" ");
            } 
            // Loop for stars
            for (int e = 0; e < a + 1; e++) {
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        // Calling all practice methods
        multiplication(9); 
        leftPattern(5); 
        pyramidPattern(5); 
    }
}
