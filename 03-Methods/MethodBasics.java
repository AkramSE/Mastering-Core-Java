/**
 * Demonstration of basic Methods in Java, returning values,
 * and the difference between Pass-by-Value (Primitives) 
 * and Pass-by-Reference-Value (Arrays/Objects).
 */
public class MethodBasics {
    
    // 1. A basic method returning an integer
    static int calculateLogic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    
    // 2. A void method (returns nothing)
    static void tellJoke() {
        System.out.println("I invented a new word!\nPlagiarism!");
    }
    
    // 3. Method trying to change a primitive value (Pass-by-Value)
    static void changePrimitive(int a) {
        a = 98; // This change will NOT reflect in the main method
    }
    
    // 4. Method trying to change an array value (Pass-by-Reference-Value)
    static void changeArray(int[] arr) {
        arr[0] = 98; // This change WILL reflect in the main method
    }

    public static void main(String[] args) {
        
        System.out.println("---> 1. Calling Basic Methods <---");
        int a = 7, b = 5;
        System.out.println("Logic Result 1: " + calculateLogic(a, b));
        
        int a1 = 2, b1 = 1;
        System.out.println("Logic Result 2: " + calculateLogic(a1, b1));
        
        System.out.println("\n---> 2. Void Method <---");
        tellJoke();
        
        System.out.println("\n---> 3. Primitive vs Array Modification <---");
        int x = 45;
        changePrimitive(x);
        System.out.println("Value of x after running changePrimitive: " + x); // Still 45
        
        int[] marks = {52, 73, 77, 89, 98, 94};
        changeArray(marks);
        System.out.println("Value of marks[0] after running changeArray: " + marks[0]); // Changed to 98
    }
}
