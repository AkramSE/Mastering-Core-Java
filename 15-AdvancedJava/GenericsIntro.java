import java.util.ArrayList;

/**
 * Introduction to Java Generics.
 * Demonstrates the problem of not using Generics (Type safety issues)
 * and how Generics solve them.
 */
public class GenericsIntro {
    public static void main(String[] args) {
        
        System.out.println("--->1. Without Java Generics (Pre Java 5) <---");
        ArrayList myArrayList = new ArrayList(); // No type specified
        myArrayList.add(10);           // Integer
        myArrayList.add("Akram Bhai!"); // String
        myArrayList.add(20.4);         // Double

        // We have to manually cast objects, which is risky and can cause runtime errors!
        int x = (int) myArrayList.get(0); 
        System.out.println("Value at index 0 (Typecasted): " + x);

        // String str = (String) myArrayList.get(0); // This would cause a ClassCastException at runtime!

        System.out.println("\n---> 2. With Java Generics <---");
        ArrayList<Integer> genericList = new ArrayList<>(); // Type specified as Integer
        genericList.add(10);
        genericList.add(20);
        // genericList.add("String"); // Compiler ERROR! This makes our code safe.

        // No typecasting required!
        int y = genericList.get(0);
        System.out.println("Value at index 0 (Safe): " + y);
    }
}
