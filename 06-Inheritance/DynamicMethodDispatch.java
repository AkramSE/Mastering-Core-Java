/**
 * Demonstration of Dynamic Method Dispatch (Runtime Polymorphism).
 * A superclass reference variable can refer to a subclass object.
 */

class Phone {
    public void showTime() {
        System.out.println("Time is 8 AM");
    }
    public void on() {
        System.out.println("Turning on Basic Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }
    
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        System.out.println("---> Dynamic Method Dispatch <---");
        
        // Superclass reference = Subclass object (ALLOWED)
        // Think of it as: "A Smartphone is a type of Phone"
        Phone obj = new SmartPhone(); 
        
        // obj can only access methods defined in Phone class
        obj.showTime(); 
        
        // BUT, if the method is overridden, the Subclass version runs!
        obj.on(); 
        
        // obj.music(); // NOT ALLOWED: music() is not defined in Phone class
    }
}
