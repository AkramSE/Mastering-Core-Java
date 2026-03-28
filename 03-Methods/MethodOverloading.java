/**
 * Demonstration of Method Overloading in Java.
 * Multiple methods can have the same name as long as the 
 * number, order, or type of parameters are different.
 */
public class MethodOverloading {
    
    // Overloaded Method 1: No parameters
    static void greet() {
        System.out.println("Good Morning bro!");
    }
    
    // Overloaded Method 2: One parameter
    static void greet(int a) {
        System.out.println("Good Morning " + a + " bro!");
    }
    
    // Overloaded Method 3: Two parameters
    static void greet(int a, int b) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }
    
    // Overloaded Method 4: Three parameters
    static void greet(int a, int b, int c) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
        System.out.println("Good Morning " + c + " bro!");
    }

    public static void main(String[] args) {
        
        System.out.println("---> Method Overloading Examples <---");
        
        // Calling methods based on the arguments passed (Actual Arguments)
        greet(); 
        System.out.println();
        
        greet(3000); 
        System.out.println();
        
        greet(3000, 4000); 
    }
} 
