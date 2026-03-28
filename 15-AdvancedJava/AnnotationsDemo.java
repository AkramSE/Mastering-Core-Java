/**
 * Demonstration of built-in Java Annotations.
 * Includes @FunctionalInterface, @Override, @Deprecated, and @SuppressWarnings.
 */

@FunctionalInterface
interface MyFunctionalInterface {
    void thisMethod(); // A functional interface can only have ONE abstract method
    // void thisMethod2(); // Adding this will throw an error because of the annotation
}

class Phone {
    public void showTime() {
        System.out.println("Time is 8 AM");
    }
}

class NewPhone extends Phone {
    
    @Override
    public void showTime() {
        System.out.println("Time is 8 PM");
    }
    
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class AnnotationsDemo {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("---> Annotations Demo <---");
        
        NewPhone phone = new NewPhone();
        phone.showTime();
        
        // Calling a deprecated method. 
        // @SuppressWarnings stops the compiler from showing a yellow warning here.
        System.out.println("Sum is: " + phone.sum(5, 6)); 
    }
}
