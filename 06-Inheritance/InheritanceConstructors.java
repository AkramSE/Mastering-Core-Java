/**
 * Demonstration of Constructors in Inheritance and the 'super' keyword.
 * Shows how constructors are called from top to bottom (Base -> Derived -> Child).
 */

class Base1 {
    Base1() {
        System.out.println("I am Base class constructor");
    }
    Base1(int x) {
        System.out.println("I am an overloaded Base constructor with value of x: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        // super(0); // Optional: Calls parameterized constructor of Base
        System.out.println("I am Derived class constructor");
    }
    Derived1(int x, int y) {
        super(x); // Calls Base1(int x)
        System.out.println("I am overloaded Derived constructor with value of y: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I am ChildOfDerived class constructor");
    }
    ChildOfDerived(int x, int y, int z) {
        super(x, y); // Calls Derived1(int x, int y)
        System.out.println("I am overloaded ChildOfDerived constructor with value of z: " + z);
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Calling Default Constructors <---");
        // Calls Base1() -> Derived1() -> ChildOfDerived()
        ChildOfDerived c1 = new ChildOfDerived(); 
        
        System.out.println("\n---> 2. Calling Parameterized Constructors <---");
        // Calls Base1(x) -> Derived1(x, y) -> ChildOfDerived(x, y, z)
        ChildOfDerived c2 = new ChildOfDerived(12, 13, 15); 
    }
}
