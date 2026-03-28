/**
 * Demonstration of Thread Constructors.
 * Shows how to set custom names and IDs to identify specific threads.
 */

class MyCustomThread extends Thread {
    private int customId;

    // Constructor with Thread Name
    public MyCustomThread(String name) {
        super(name); // Passes the name to the parent Thread class
    }

    // Constructor with Thread Name and Custom ID
    public MyCustomThread(String name, int id) {
        super(name);
        this.customId = id;
    }

    public int getCustomId() {
        return customId;
    }

    @Override
    public void run() {
        System.out.println("Running -> Thread Name: " + getName() + " | Custom ID: " + customId);
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        System.out.println("---> Thread Constructors & Names <---");

        MyCustomThread t1 = new MyCustomThread("Saddar");
        MyCustomThread t2 = new MyCustomThread("Mohsin", 101);
        MyCustomThread t3 = new MyCustomThread("Muhammad Akram", 99);

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        // Getting system-generated IDs vs Custom IDs
        System.out.println("System ID of t1: " + t1.getId());
        System.out.println("Custom ID of t2: " + t2.getCustomId());
    }
}
