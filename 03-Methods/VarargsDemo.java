/**
 * Demonstration of Variable Arguments (Varargs) in Java.
 * Varargs allow methods to accept zero or multiple arguments,
 * packing them automatically into an array.
 */
public class VarargsDemo {
    
    // Method using Varargs (behaves as int[] arr)
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    
    // Method enforcing at least ONE mandatory argument, 
    // followed by optional Varargs
    static int addWithMandatoryArg(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println("--- Welcome to Varargs Tutorial ---");
        
        // Varargs allows passing any number of arguments, even zero!
        System.out.println("Sum of nothing (0 args): " + add()); 
        System.out.println("Sum of 1 and 2: " + add(1, 2));
        System.out.println("Sum of 2, 3, and 4: " + add(2, 3, 4));
        System.out.println("Sum of 4, 3, 5, 10, and 20: " + add(4, 3, 5, 10, 20));
        
        System.out.println("\n--- Varargs with Mandatory Arguments ---");
        // addWithMandatoryArg(); // This will throw an error because at least 1 arg is needed
        System.out.println("Sum with mandatory arg (4 and 5): " + addWithMandatoryArg(4, 5));
    }
}
