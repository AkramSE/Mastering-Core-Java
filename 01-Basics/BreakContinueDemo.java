/**
 * Demonstration of Jump Statements in Java.
 * Explaining how 'break' exits the loop completely, 
 * and 'continue' skips only the current iteration.
 */
public class BreakContinueDemo {
    public static void main(String[] args) {

        System.out.println("===== BREAK STATEMENT =====");

        // 1. Break in For Loop
        System.out.println("\n--- 1. Break in For Loop ---");
        for (int a = 1; a <= 4; a++) {
            if (a == 2) {
                System.out.println("End the loop (Break triggered at 2)");
                break; // Completely exits the loop
            }
            System.out.println(a + " - Java is great");
        }

        // 2. Break in While Loop
        System.out.println("\n--- 2. Break in While Loop ---");
        int b = 1;
        while (b <= 4) {
            if (b == 2) {
                System.out.println("End the loop (Break triggered at 2)");
                break;
            }
            System.out.println(b + " - Java is great");
            b++;
        }


        System.out.println("\n===== CONTINUE STATEMENT =====");

        // 3. Continue in For Loop
        System.out.println("\n--- 3. Continue in For Loop ---");
        for (int i = 1; i <= 4; i++) {
            if (i == 2) {
                System.out.println("Skip this iteration (Continue triggered at 2)");
                continue; // Skips printing for '2' and goes to the next iteration
            }
            System.out.println(i + " - Java is great");
        }

        // 4. Continue in While Loop
        System.out.println("\n--- 4. Continue in While Loop ---");
        int j = 0; 
        while (j < 4) {
            j++; // Incremented before condition to avoid infinite loop with continue
            if (j == 2) {
                System.out.println("Skip this iteration (Continue triggered at 2)");
                continue;
            }
            System.out.println(j + " - Java is great");
        }
    }
}
