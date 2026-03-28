import java.util.Scanner;

/**
 * Demonstration of Switch Case statements using Integers, 
 * Characters (Vowel/Consonant), and Strings (Website Identifier).
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Switch Case with Integers (Age Check)
        System.out.println("1. Life Stage Check:");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        switch (age) {
            case 18:
                System.out.println("You have become an adult!");
                break;
            case 23:
                System.out.println("Time to join a job!");
                break;
            case 60:
                System.out.println("Time to retire and relax!");
                break;
            default:
                System.out.println("Enjoy your life at any age!");
        }

        // 2. Switch Case with Characters (Vowel Check)
        System.out.println("\n2. Vowel or Consonant Check:");
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);
        
        switch (Character.toLowerCase(ch)) { // Converts to lowercase for easier checking
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                System.out.println(ch + " is a Consonant (or symbol).");
        }

        // 3. Real-world Check (Website Identifier)
        System.out.println("\n3. Website Type Identifier:");
        System.out.print("Enter a website URL (e.g., example.com): ");
        String website = sc.next();
        
        if (website.endsWith(".org")) {
            System.out.println("This is an Organizational website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial website.");
        } else if (website.endsWith(".pk")) {
            System.out.println("This is a Pakistani website.");
        } else {
            System.out.println("Unknown domain type.");
        } 
    }
}
