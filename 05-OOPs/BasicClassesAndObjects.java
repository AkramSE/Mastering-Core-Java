/**
 * Demonstration of Custom Classes, Objects, and Methods in Java.
 */

class Employee {
    int id;
    int salary;
    String name;

    public void printDetail() {
        System.out.println("My ID is " + id);
        System.out.println("My name is " + name);
        System.out.println("My salary is " + salary);
    }
    public int getSalary() {
        return salary;
    }
}

class Cellphone {
    public void ring() { System.out.println("Ringing..."); }
    public void vibrate() { System.out.println("Vibrating..."); }
    public void callFriend() { System.out.println("Calling Brother..."); }
}

class Square {
    int side;
    public int area() { return side * side; }
    public int perimeter() { return 4 * side; }
}

class Tommy {
    public void hit() { System.out.println("Hitting the enemy"); }
    public void run() { System.out.println("Running from the enemy"); }
    public void fire() { System.out.println("Firing at the enemy"); }
}

public class BasicClassesAndObjects {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Employee Class <---");
        Employee harry = new Employee();
        harry.id = 12;
        harry.salary = 34000;
        harry.name = "Muhammad Akram";
        harry.printDetail();

        System.out.println("\n---> 2. Cellphone Class <---");
        Cellphone oppo = new Cellphone();
        oppo.ring();
        oppo.vibrate();
        oppo.callFriend();

        System.out.println("\n---> 3. Square Class <---");
        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Perimeter of Square: " + sq.perimeter());

        System.out.println("\n---> 4. Game Character (Tommy) <---");
        Tommy player = new Tommy();
        player.hit();
        player.run();
        player.fire();
    }
}
