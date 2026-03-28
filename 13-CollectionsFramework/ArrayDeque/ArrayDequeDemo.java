import java.util.ArrayDeque;

/**
 * Demonstration of ArrayDeque (Double Ended Queue) in Java.
 * It allows insertion, deletion, and retrieval from BOTH ends (Head and Tail).
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        
        System.out.println("---> 1. Inserting Elements <---");
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        
        // Insertion at Front (Head)
        ad1.addFirst(5);    // Throws exception if full
        ad1.offerFirst(10); // Returns false if full (safer)
        
        // Insertion at End (Tail)
        ad1.addLast(91);
        ad1.offerLast(19);
        
        System.out.println("ArrayDeque after insertions: " + ad1);

        System.out.println("\n---> 2. Accessing Elements <---");
        // Accessing First Element
        System.out.println("Get First (Throws exception if empty): " + ad1.getFirst());
        System.out.println("Peek First (Returns null if empty): " + ad1.peekFirst());
        
        // Accessing Last Element
        System.out.println("Get Last: " + ad1.getLast());
        System.out.println("Peek Last: " + ad1.peekLast());

        System.out.println("\n---> 3. Removing Elements <---");
        // Removing from Front
        System.out.println("Removed from Front (pollFirst): " + ad1.pollFirst()); // 10
        System.out.println("Removed from Front (removeFirst): " + ad1.removeFirst()); // 5
        
        // Removing from End
        System.out.println("Removed from End (pollLast): " + ad1.pollLast()); // 19
        System.out.println("Removed from End (removeLast): " + ad1.removeLast()); // 91
        
        System.out.println("ArrayDeque after removals: " + ad1);
    }
}
