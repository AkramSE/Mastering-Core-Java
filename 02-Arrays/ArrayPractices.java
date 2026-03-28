/**
 * Practical exercises on Arrays including sum, average, 
 * searching, reversing an array, and checking if sorted.
 */
public class ArrayPractices {
    public static void main(String[] args) {
        
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f}; 

        // Practice 1 & 3: Sum and Average
        float sum = 0; 
        for(float element : marks) {
           sum += element; 
        } 
        System.out.println("The Sum of marks is: " + sum); 
        System.out.println("The Average marks is: " + (sum / marks.length)); 

        // Practice 2: Search in Array
        float target = 45.57f; 
        boolean isInArray = false; 
        for(float element : marks) {
            if(target == element) {
                isInArray = true; 
                break; 
            }
        } 
        if(isInArray) {
            System.out.println("The target value " + target + " IS present in the array."); 
        } else {
            System.out.println("The target value " + target + " IS NOT present in the array.");
        }

        // Practice 5: Reverse an Array
        System.out.println("\nReversing an Array:");
        int[] arr = {1, 21, 3, 4, 5, 34, 67}; 
        int l = arr.length; 
        int n = Math.floorDiv(l, 2); 
        int temp; 
        
        for(int i = 0; i < n; i++) { 
           temp = arr[i]; 
           arr[i] = arr[l - i - 1]; 
           arr[l - i - 1] = temp; 
        } 
        
        for(int element : arr) { 
           System.out.print(element + " "); 
        } 
        
        // Practice: Check if Array is Sorted
        System.out.println("\n\nChecking if Array is Sorted:");
        boolean isSorted = true; 
        int[] sortedCheckArr = {1, 12, 3, 4, 5, 34, 67}; 
        
        for(int a = 0; a < sortedCheckArr.length - 1; a++) {
           if(sortedCheckArr[a] > sortedCheckArr[a + 1]) {
              isSorted = false; 
              break; 
           }
        } 
        
        if(isSorted) { 
           System.out.println("The Array is sorted."); 
        } else {
           System.out.println("The Array is NOT sorted."); 
        }
    }
              }
