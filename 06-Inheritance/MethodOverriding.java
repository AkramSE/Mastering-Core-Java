/**
 * Demonstration of Method Overriding in Java.
 * The child class provides a specific implementation of a method 
 * that is already provided by its parent class.
 */

class A {
    public int a;
    
    public int calculateLogic() {
        return 4;
    }
    
    public void meth2() {
        System.out.println("I am method 2 of class A (Parent)");
    }
}

class B extends A {
    
    // Using @Override annotation is a good industry practice
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B (Child - Overridden)");
    }
    
    public void meth3() {
        System.out.println("I am method 3 of class B (Child Specific)");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
        System.out.println("---> Parent Class Output <---");
        A parentObj = new A();
        parentObj.meth2();
        
        System.out.println("\n---> Child Class Output <---");
        B childObj = new B();
        childObj.meth2(); // This will call the overridden method in Class B
        childObj.meth3();
    }
} 
