/**
 * Demonstration of iterative statements (Loops) in Java.
 * Includes For loop, While loop, and Do-While loop.
 */
public class LoopsDemo {
    public static void main(String[] args) {
        
        // 1. For Loop
        System.out.println("--- 1. For Loop (1 to 100) ---");
        for (int a = 1; a <= 100; a++) {
            System.out.print(a + " ");
        }

        // 2. While Loop
        System.out.println("\n\n--- 2. While Loop (1 to 100) ---");
        int e = 1;
        while (e <= 100) {
            System.out.print(e + " ");
            e++;
        }

        // 3. Do-While Loop
        // Note: Do-While loop runs AT LEAST ONCE even if the condition is false.
        System.out.println("\n\n--- 3. Do-While Loop (1 to 100) ---");
        int p = 1;
        do {
            System.out.print(p + " ");
            p++;
        } while (p <= 100);
        
        System.out.println("\nLoops executed successfully!");
    }
}
