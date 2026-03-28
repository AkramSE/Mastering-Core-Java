/**
 * Practical OOP exercises using geometric shapes (Cylinder & Rectangle).
 * Demonstrates Math operations, constructors, and encapsulation.
 */

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
    
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() { return length; }
    public int getBreadth() { return breadth; }
}

public class GeometryOOPPractice {
    public static void main(String[] args) {
        
        System.out.println("---> Cylinder Operations <---");
        Cylinder myCylinder = new Cylinder(9, 12);
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.println("Surface Area: " + myCylinder.surfaceArea());
        System.out.println("Volume: " + myCylinder.volume());

        System.out.println("\n---> Rectangle Operations <---");
        Rectangle r1 = new Rectangle(); // Uses default constructor
        System.out.println("Default Rectangle L: " + r1.getLength() + ", B: " + r1.getBreadth());

        Rectangle r2 = new Rectangle(12, 56); // Uses parameterized constructor
        System.out.println("Custom Rectangle L: " + r2.getLength() + ", B: " + r2.getBreadth());
    }
}
