/**
 * Demonstration of Constructors and Constructor Overloading in Java.
 */

class MyMainEmployee {
    private int id;
    private String name;

    // Default Constructor
    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    // Overloaded Constructor (Only Name)
    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    // Overloaded Constructor (Name and ID)
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName() { return name; }
    public int getId() { return id; }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Default Constructor <---");
        MyMainEmployee emp1 = new MyMainEmployee();
        System.out.println("Name: " + emp1.getName() + ", ID: " + emp1.getId());

        System.out.println("\n---> 2. Overloaded Constructor (String) <---");
        MyMainEmployee emp2 = new MyMainEmployee("Programmer");
        System.out.println("Name: " + emp2.getName() + ", ID: " + emp2.getId());

        System.out.println("\n---> 3. Overloaded Constructor (String, Int) <---");
        MyMainEmployee emp3 = new MyMainEmployee("Muhammad Akram", 34);
        System.out.println("Name: " + emp3.getName() + ", ID: " + emp3.getId());
    }
}
