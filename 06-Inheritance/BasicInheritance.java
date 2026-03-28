/**
 * Demonstration of Basic Inheritance in Java.
 * The Derived class inherits properties (getters/setters) from the Base class.
 */

class Base {
    public int x;

    public int getX() { return x; }

    public void setX(int x) {
        System.out.println("I am in Base class and setting x now");
        this.x = x;
    }
}

class Derived extends Base {
    public int y;

    public int getY() { return y; }

    public void setY(int y) {
        System.out.println("I am in Derived class and setting y now");
        this.y = y;
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        
        System.out.println("---> Using Base Class Object <---");
        Base b = new Base();
        b.setX(4);
        System.out.println("Base X: " + b.getX());

        System.out.println("\n---> Using Derived Class Object <---");
        Derived d = new Derived();
        d.setY(43);
        System.out.println("Derived Y: " + d.getY());
        
        // The magic of inheritance: Derived object can access Base class methods
        d.setX(100); 
        System.out.println("Derived X (Inherited): " + d.getX());
    }
}
