/**
 * Demonstration of various Operators in Java: 
 * Arithmetic, Relational/Comparison, Logical, and Precedence.
 */
public class OperatorsDemo {
    public static void main(String[] args) {
        // 1. Arithmetic & Increment/Decrement
        System.out.println("Arithmetic Operators:");
        int a = 4, b = 4;
        System.out.println("a + b = " + (a + b));
        System.out.println("a % b = " + (a % b));
        System.out.println("Post-increment (a++): " + (a++)); 
        System.out.println("Pre-increment (++a): " + (++a)); 
        
        // 2. Relational
        System.out.println("\nRelational Operators:");
        int x = 4, y = 3;
        System.out.println("x == y is: " + (x == y));
        System.out.println("x != y is: " + (x != y));

        // 3. Logical
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND (&&): " + ((x > y) && (x != y))); 
        System.out.println("Logical OR (||): " + ((x == y) || (x > y))); 
        System.out.println("Logical NOT (!): " + (!(x == y))); 

        // 4. Precedence
        System.out.println("\nOperator Precedence:");
        int result1 = 6 * 5 - 34 / 2; // (30) - (17) = 13
        int result2 = 60 / 5 - 34 * 2; // (12) - (68) = -56
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
