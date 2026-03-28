import java.util.Scanner;

/**
 * Exercise 1: Taking user input to calculate total marks, percentage, and CGPA.
 * Demonstrates the use of Scanner class and basic arithmetic operations.
 */
public class MarksPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Result Calculator:");
        
        System.out.print("Enter English marks: ");
        int englishMarks = sc.nextInt();
        
        System.out.print("Enter Physics marks: ");
        int physicsMarks = sc.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chemistryMarks = sc.nextInt();
        
        System.out.print("Enter Programming marks: ");
        int programmingMarks = sc.nextInt();
        
        System.out.print("Enter Math marks: ");
        int mathMarks = sc.nextInt();
        
        // Calculating total and percentage
        int totalMarks = englishMarks + physicsMarks + chemistryMarks + programmingMarks + mathMarks;
        float percentage = ((float) totalMarks / 500) * 100; 
        
        System.out.println("\nTotal Marks: " + totalMarks + " out of 500");
        System.out.println("Your Percentage is: " + percentage + "%");
    }
}
