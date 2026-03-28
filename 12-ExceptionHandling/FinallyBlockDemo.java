/**
 * Demonstration of the 'finally' block in Java.
 * The finally block executes regardless of whether an exception is thrown or caught.
 * It even executes if there is a 'return' or 'break' statement inside the try/catch.
 */
public class FinallyBlockDemo {
    
    public static int divideLogic() {
        try {
            int a = 50;
            int b = 10;
            return a / b; // Returns 5
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources... This ALWAYS runs before returning!");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("---> Finally Block with Return <---");
        int result = divideLogic();
        System.out.println("Result: " + result);

        System.out.println("\n---> Finally Block with Loop & Break <---");
        int a = 7;
        int b = 3; // Will loop until b becomes 0, then throw exception and break
        
        while (true) {
            try {
                System.out.println("7 divided by " + b + " = " + (a / b));
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
                break; // Breaking the loop
            } finally {
                System.out.println("I am 'finally' for value of b = " + b);
            }
            b--;
        }

        System.out.println("\n---> Standalone Try-Finally (No Catch) <---");
        try {
            System.out.println("Executing 50/3 = " + (50 / 3));
        } finally {
            System.out.println("Yes, this is finally running without a catch block!");
        }
    }
}
