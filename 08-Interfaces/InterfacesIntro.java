/**
 * Basic Introduction to Interfaces.
 * Interfaces contain purely abstract methods (by default) 
 * and properties are final by default. A class can implement multiple interfaces.
 */

// Define an interface
interface Animal {
    void makeSound(); // abstract method, must be implemented by any class
}

// Dog class implements the Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

// Cat class implements the Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

public class InterfacesIntro {
    public static void main(String[] args) {

        System.out.println("---> Interface Implementation <---");
        
        // Creating objects using Interface references (Polymorphism)
        Animal myDog = new Dog(); 
        Animal myCat = new Cat(); 

        myDog.makeSound();
        myCat.makeSound();
    }
}
