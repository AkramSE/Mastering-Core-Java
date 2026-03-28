/**
 * Demonstration of Basic Polymorphism using Classes and Interfaces.
 * Shows how reference types determine which methods can be called.
 */

// --- Example 1: Simple Polymorphism ---
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// --- Example 2: Polymorphism with Interfaces & Abstract Classes ---
interface BasicAnimal {
    void eat();
    void sleep();
}

class Monkey {
    void jump() { System.out.println("Jumping..."); }
    void bite() { System.out.println("Biting..."); }
}

class Human extends Monkey implements BasicAnimal {
    void speak() { System.out.println("Hello sir!"); }

    @Override
    public void eat() { System.out.println("Human is eating"); }

    @Override
    public void sleep() { System.out.println("Human is sleeping"); }
}

public class BasicPolymorphism {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Simple Polymorphism <---");
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Superclass reference, Subclass object
        
        myAnimal.makeSound();
        myDog.makeSound(); // Calls Dog's overridden method (Dynamic Method Dispatch)
        
        System.out.println("\n---> 2. Polymorphism Restrictions <---");
        // Using Monkey reference for Human object
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> ERROR: Cannot use speak() because the reference 'Monkey' does not have this method.

        // Using Interface reference for Human object
        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();
        // lovish.speak(); --> ERROR: Cannot use speak() because 'BasicAnimal' interface doesn't have it.
    }
}
