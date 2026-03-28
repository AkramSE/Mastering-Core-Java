import java.util.Scanner;

// --- Custom Exceptions ---
class InvalidInputException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Input: Cannot add 8 and 9!";
    }
}

class MaxInputException extends Exception {
    @Override
    public String getMessage() {
        return "Max Input Reached: Input cannot be greater than 100,000!";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String getMessage() {
        return "Math Error: Cannot divide by 0!";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String getMessage() {
        return "Max Multiplier Reached: Input cannot be greater than 7000 while multiplying!";
    }
}

// --- Calculator Logic ---
class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 8 && b == 9) { // Fixed logic: usually it's specifically 8 and 9 together
            throw new InvalidInputException();
        }
        return a + b;
    }

    double subtract(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

// --- Main Application ---
public class CustomCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomCalculator calc = new CustomCalculator();

        System.out.println("=== Welcome to the Custom Secure Calculator ===");
        System.out.println("Rules:");
        System.out.println("1. Max input allowed is 100,000.");
        System.out.println("2. Cannot multiply numbers greater than 7000.");
        System.out.println("3. Cannot divide by 0.");
        System.out.println("4. Cannot add 8 and 9.");

        while (true) {
            try {
                System.out.println("\n--------------------------------");
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter operator (+, -, *, /) or type 'e' to exit: ");
                char op = sc.next().charAt(0);
                
                if (op == 'e' || op == 'E') {
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;
                }

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;

                // Performing operation based on user input
                switch (op) {
                    case '+':
                        result = calc.add(num1, num2);
                        break;
                    case '-':
                        result = calc.subtract(num1, num2);
                        break;
                    case '*':
                        result = calc.multiply(num1, num2);
                        break;
                    case '/':
                        result = calc.divide(num1, num2);
                        break;
                    default:
                        System.out.println("❌ Invalid operator! Please use +, -, *, or /.");
                        continue; // Skips the rest of the loop and starts over
                }

                System.out.println("✅ Result: " + result);

            } catch (Exception e) {
                // This single catch block gracefully handles ALL our custom exceptions
                // as well as InputMismatchException (if user types letters instead of numbers)
                System.out.println("🚨 ERROR: " + e.getMessage());
                sc.nextLine(); // Clear the scanner buffer to prevent infinite loop on wrong input
            }
        }
    }
}
