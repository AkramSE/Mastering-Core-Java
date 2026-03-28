/**
 * Demonstration of Array creation, initialization, 
 * and traversing using For loops and For-Each loops.
 */
public class ArrayBasics {
    public static void main(String[] args) {
        
        // 1. Array Declarations
        int[] marks = {98, 45, 79, 99, 80}; 
        String[] students = {"Akram", "Saddar", "Lovish", "Mohsin"}; 
        
        System.out.println("Number of students: " + students.length); 
        System.out.println("First student: " + students[0]); 
        
        // 2. Displaying the Array (Naive way) 
        System.out.println("\nPrinting using naive way:"); 
        System.out.println(marks[0]);
        System.out.println(marks[1]); 
        System.out.println(marks[2]); 
        
        // 3. Displaying the Array (for loop) 
        System.out.println("\nPrinting using for loop:"); 
        for(int i = 0; i < marks.length; i++) {
             System.out.println("Element at index " + i + ": " + marks[i]); 
        } 
        
        // 4. Quick Quiz: Displaying the Array in Reversed order
        System.out.println("\nPrinting in reverse order (for loop):"); 
        for(int i = marks.length - 1; i >= 0; i--) {
             System.out.println(marks[i]); 
        } 
        
        // 5. Quick Quiz: Displaying the Array (for-each loop) 
        System.out.println("\nPrinting using for-each loop:"); 
        for(int element : marks) {
             System.out.println(element); 
        }
    }
} 
