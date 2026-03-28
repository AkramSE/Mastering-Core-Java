import java.util.ArrayList;

/**
 * Demonstration of ArrayList in the Java Collections Framework.
 * Features: Adding, Removing, Searching, and Merging elements.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Adding Elements <---");
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5, 5);  // Inserts 5 at the 5th index

        System.out.println("ArrayList l1: " + l1);

        System.out.println("\n---> 2. Removing Elements <---");
        l1.remove(0); // Removes the value at index 0
        System.out.println("l1 after removing element at index 0: " + l1);

        System.out.println("\n---> 3. Checking for Specific Values <---");
        System.out.println("Does l1 contain 7? : " + l1.contains(7));
        System.out.println("Does l1 contain 4? : " + l1.contains(4));

        System.out.println("\n---> 4. Finding Index of Elements <---");
        l1.add(3); // Adding a duplicate to test indexOf
        System.out.println("Current l1: " + l1);
        System.out.println("First occurrence of 3 is at index: " + l1.indexOf(3));
        System.out.println("Last occurrence of 3 is at index: " + l1.lastIndexOf(3));

        System.out.println("\n---> 5. Merging Two ArrayLists <---");
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);

        System.out.println("l2 Array list: " + l2);
        l1.addAll(l2); // Appends all elements of l2 to the end of l1
        System.out.println("l1 Array list after merging l2: " + l1);
    }
}
