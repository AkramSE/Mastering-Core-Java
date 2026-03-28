/**
 * Demonstration of Access Modifiers in Java.
 * Explains visibility rules: Public, Protected, Default (Package-Private), and Private.
 */

class C1 {
    public int x = 5;         // Accessible everywhere
    protected int y = 45;     // Accessible in the same package and subclasses
    int z = 6;                // Default: Accessible only within the same package
    private int a = 78;       // Accessible ONLY within this class

    public void meth1() {
        System.out.println("---> Inside the Same Class <---");
        System.out.println("Public x: " + x);
        System.out.println("Protected y: " + y);
        System.out.println("Default z: " + z);
        System.out.println("Private a: " + a); // Private is accessible here
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        
        C1 c = new C1();
        
        // Calling method from the class (Everything is accessible inside it)
        c.meth1();

        System.out.println("\n---> Inside the Same Package (Different Class) <---");
        System.out.println("Public x: " + c.x);
        System.out.println("Protected y: " + c.y);
        System.out.println("Default z: " + c.z);
        
        // System.out.println(c.a); --> ERROR: 'a' has private access in 'C1'
    }
}
