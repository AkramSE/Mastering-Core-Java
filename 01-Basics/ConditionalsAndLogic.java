import java.util.Scanner;

/**
 * Demonstration of If-Else statements, Else-If ladder, 
 * Logical operators, and a student passing criteria exercise.
 */
public class ConditionalsAndLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Basic If-Else & Logical Operators
        System.out.println("1. Basic Driving Check:");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age > 18) {
            System.out.println("Yes, you can drive.");
        } else {
            System.out.println("No, you cannot drive yet.");
        }

        // 2. Else-If Ladder (Experience Check)
        System.out.println("\n2. Experience Level Check:");
        if (age >= 56) {
            System.out.println("You are Highly Experienced.");
        } else if (age >= 46) {
            System.out.println("You are Semi-Experienced.");
        } else if (age >= 36) {
            System.out.println("You have Basic Experience.");
        } else if (age >= 18) {
            System.out.println("You are a fresher.");
        }

        // 3. Complex Logic (Student Passing Criteria)
        System.out.println("\n3. Student Selection Criteria:");
        System.out.print("Enter English marks: ");
        byte m1 = sc.nextByte();
        
        System.out.print("Enter Physics marks: ");
        byte m2 = sc.nextByte();
        
        System.out.print("Enter Chemistry marks: ");
        byte m3 = sc.nextByte();
        
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your overall percentage is " + avg + "%");
        
        // Student passes if overall is >= 40% AND each subject is >= 33
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations 🎉 you have been selected!");
        } else {
            System.out.println("Sorry, you have not been selected.");
        } 
    }
}
