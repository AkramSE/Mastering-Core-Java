import java.util.HashSet;

/**
 * Demonstration of HashSet in the Java Collections Framework.
 * * * INTERVIEW NOTES:
 * - HashSet does NOT maintain insertion order.
 * - It only stores UNIQUE elements (duplicates are automatically ignored).
 * - Underlying data structure is a Hash Table.
 * - Basic operations (add, remove, contains) take O(1) constant time.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Creating and Adding Elements <---");
        // Initial capacity of 6 and Load Factor of 0.5f (Resizes when 50% full)
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // Duplicate element: This will be silently ignored!

        System.out.println("HashSet elements (Order is not guaranteed): " + myHashSet);

        System.out.println("\n---< 2. Removing an Element <---");
        System.out.println("HashSet before removing 3: " + myHashSet);
        myHashSet.remove(3); // Deletes 3 from the HashSet safely
        System.out.println("HashSet after removing 3: " + myHashSet);

        System.out.println("\n---> 3. Checking if HashSet is Empty <---");
        HashSet<Integer> emptySet = new HashSet<>();
        System.out.println("Is 'myHashSet' empty? " + myHashSet.isEmpty());
        System.out.println("Is 'emptySet' empty? " + emptySet.isEmpty());

        System.out.println("\n---> 4. Getting the Size of HashSet <---");
        System.out.println("The current size of 'myHashSet' is: " + myHashSet.size());

        System.out.println("\n---> 5. Clearing all Elements <---");
        myHashSet.clear(); // Removes all elements from the HashSet
        System.out.println("HashSet after clear() method: " + myHashSet);
        System.out.println("Size after clear(): " + myHashSet.size());
    }
          }
