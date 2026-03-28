import java.util.LinkedList;

/**
 * LinkedList in Java provides a Doubly Linked List data structure.
 * * INTERVIEW NOTES:
 * - Each element is a 'Node' pointing to its previous and next node.
 * - Preferred over ArrayList when frequent Insertion & Deletion is required 
 * (constant time O(1)), because Arrays require shifting elements.
 * - Slower for accessing elements directly (requires traversal O(N)).
 */
public class LinkedListConcepts {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        
        l2.add(15);
        l2.add(18);
        l2.add(19);

        // Adding elements to l1
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        
        // Adding at specific indexes
        l1.add(0, 5);
        l1.add(0, 1);
        
        // Merging l2 into l1 starting at index 0
        l1.addAll(0, l2);
        
        // LinkedList specific methods
        l1.addLast(676);
        l1.addFirst(788);
        
        System.out.println("Contains 27? " + l1.contains(27));
        System.out.println("First index of 6: " + l1.indexOf(6));
        System.out.println("Last index of 6: " + l1.lastIndexOf(6));
        
        // Updating an element
        l1.set(1, 566);
        
        System.out.println("\n---> Traversing the LinkedList <---");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            if (i < l1.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
