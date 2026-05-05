public class SecondLargestElement {

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int secondLargest = findSecondLargest(numbers);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element exists in the array.");
        }
    }

    /**
     * Finds the second largest element in an array in a single pass.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int findSecondLargest(int[] arr) {
        // Edge Case: Array must have at least 2 elements
        if (arr.length < 2) {
            System.out.println("Error: Array size must be at least 2.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than the largest
            if (arr[i] > largest) {
                secondLargest = largest; // Previous largest becomes second largest
                largest = arr[i];        // Update the new largest
            } 
            // If current element is smaller than largest but greater than second largest
            // and it is not a duplicate of the largest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
              }
