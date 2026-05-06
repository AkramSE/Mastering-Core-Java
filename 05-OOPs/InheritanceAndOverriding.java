/**
 * Project: OOP Concepts Demonstration
 * Description: Demonstrates Inheritance, Method Overriding, Encapsulation,
 * and the use of the 'super' keyword in Java.
 */

// Base Class (Parent Class)
class Employee {
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter method for encapsulated field
    public String getName() {
        return name;
    }

    // Method intended to be overridden by subclasses
    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Total Salary: Rs. " + calculateSalary());
        System.out.println("-------------------------");
    } 

}

// Derived Class (Child Class)
class Manager extends Employee {
    private double bonus;

    // Child class constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Calls the Parent class constructor
        this.bonus = bonus;
    }

    // Overriding the parent class method to include the bonus
    @Override
    public double calculateSalary() {
        // Base salary (from parent) + Manager specific bonus
        return super.calculateSalary() + bonus; 
    } 

}

// Main Application Class
public class InheritanceAndOverriding {
    public static void main(String[] args) {
        System.out.println("--- Standard Employee Details ---");
        // Creating an object of the Parent class
        Employee emp1 = new Employee("Akram", 50000);
        emp1.displayDetails();

        System.out.println("--- Manager Details ---");
        // Creating an object of the Child class
        Manager mgr1 = new Manager("Ahmed", 80000, 15000);
        mgr1.displayDetails();
    }
}
