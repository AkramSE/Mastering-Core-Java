/**
 * Finding the Top N Largest numbers in an array 
 * without sorting the array. An optimal O(N) approach.
 */
public class LargestElementsFinder {
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Checking Min/Max bounds of Integer
        System.out.println("Integer Max Bound: " + Integer.MAX_VALUE); 
        System.out.println("Integer Min Bound: " + Integer.MIN_VALUE); 

        // Using Integer.MIN_VALUE to handle negative numbers
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int fourthMax = Integer.MIN_VALUE;

        for (int num : marks) {
            if (num > firstMax) {
                fourthMax = thirdMax;
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                fourthMax = thirdMax;
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                fourthMax = thirdMax;
                thirdMax = num;
            } else if (num > fourthMax) {
                fourthMax = num;
            }
        }

        System.out.println("\nTop Largest Elements:");
        System.out.println("First largest number: " + firstMax);
        System.out.println("Second largest number: " + secondMax);
        System.out.println("Third largest number: " + thirdMax);
        System.out.println("Fourth largest number: " + fourthMax);
    }
}
