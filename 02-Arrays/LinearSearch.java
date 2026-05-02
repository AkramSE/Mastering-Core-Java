public class LinearSearch {

    // search method for integers
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // overloaded search method for strings
    public static int search(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        // testing int array
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16};
        int targetInt = 10;
        System.out.println("Integer target found at index: " + search(nums, targetInt));

        // testing string array
        String[] menu = {"Fries", "Burger", "Sandwich", "Samosa"};
        String targetStr = "Samosa";
        System.out.println("String target found at index: " + search(menu, targetStr));
    }
}
