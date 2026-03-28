/**
 * Demonstration of Abstract Classes and Methods.
 * Abstract classes cannot be instantiated.
 * If a class extends an abstract class, it MUST implement all abstract methods.
 */

abstract class Parent {
    public Parent() {
        System.out.println("I am the constructor of Abstract Parent class");
    }

    public void sayHello() {
        System.out.println("Hello from Parent!");
    }

    // Abstract methods: No body, must be overridden by child classes
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good morning from Child!");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon from Child!");
    }
}

abstract class AbstractChild extends Parent {
    public void status() {
        System.out.println("I am good");
    }
    // Since this class is also abstract, it doesn't need to implement greet() & greet2()
}

public class AbstractClassesDemo {
    public static void main(String[] args) {

        System.out.println("--->Abstract Class Demo <---");
        
        // Parent p = new Parent(); // ERROR: Cannot instantiate abstract class
        // AbstractChild c3 = new AbstractChild(); // ERROR: Cannot instantiate abstract class

        Child c = new Child();
        c.sayHello();
        c.greet();
        c.greet2();
    }
}
