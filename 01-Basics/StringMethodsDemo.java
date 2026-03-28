import java.util.Scanner;

/**
 * Demonstration of the String class, String methods, 
 * user input for Strings, and format specifiers.
 */
public class StringMethodsDemo {
    public static void main(String[] args) {
        
        // 1. Basic String and Format Specifiers
        System.out.println("1. Format Specifiers:");
        int a = 5;
        float b = 5.9f;
        System.out.printf("The value of a is %d and the value of b is %.2f \n", a, b);

        // 2. String Input from User
        System.out.println("\n2. String Input:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Welcome, " + fullName + "!");

        // 3. String Methods Demonstration
        System.out.println("\n3. String Methods:");
        String name = "Harry";
        System.out.println("Original String: " + name);
        
        System.out.println("Length: " + name.length());
        System.out.println("To LowerCase: " + name.toLowerCase());
        System.out.println("To UpperCase: " + name.toUpperCase());
        
        String nonTrimmedString = "   Harry   ";
        System.out.println("Trimmed String: '" + nonTrimmedString.trim() + "'");
        
        System.out.println("Substring (from index 2): " + name.substring(2));
        System.out.println("Substring (index 2 to 4): " + name.substring(2, 4));
        
        System.out.println("Replace 'r' with 'p': " + name.replace('r', 'p'));
        System.out.println("Replace 'rry' with 'ier': " + name.replace("rry", "ier"));
        
        System.out.println("Starts with 'Har': " + name.startsWith("Har"));
        System.out.println("Ends with 'rry': " + name.endsWith("rry"));
        
        System.out.println("Character at index 0: " + name.charAt(0));
        
        String modifiedName = "Harryrry";
        System.out.println("First Index of 'rry': " + modifiedName.indexOf("rry"));
        System.out.println("Index of 'rry' starting from index 4: " + modifiedName.indexOf("rry", 4));
        System.out.println("Last Index of 'rry': " + modifiedName.lastIndexOf("rry"));
        
        System.out.println("Equals 'Harry': " + name.equals("Harry"));
        System.out.println("Equals Ignore Case 'HaRrY': " + name.equalsIgnoreCase("HaRrY"));
    }
                           }
