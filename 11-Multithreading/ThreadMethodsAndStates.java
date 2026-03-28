/**
 * Demonstration of Thread Methods and States.
 * Includes sleep(), join(), and checking Thread States (NEW, RUNNABLE, TERMINATED).
 */

class SleepyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("SleepyThread printing: " + i);
            try {
                // Halts execution for 455 milliseconds
                Thread.sleep(455);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }
}

class WaitingThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("WaitingThread printing: " + i);
        }
    }
}

public class ThreadMethodsAndStates {
    public static void main(String[] args) {
        SleepyThread t1 = new SleepyThread();
        WaitingThread t2 = new WaitingThread();

        System.out.println("---> Checking Thread States <---");
        System.out.println("State of t1 before start: " + t1.getState()); // Should be NEW
        System.out.println("State of Main Thread: " + Thread.currentThread().getState()); // Should be RUNNABLE

        System.out.println("\n---> Testing sleep() and join() <---");
        t1.start(); // t1 starts and will sleep between prints

        try {
            // main thread will wait until t1 finishes its execution completely
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        // t2 will only start AFTER t1 has completely finished because of t1.join()
        t2.start();
        
        System.out.println("State of t1 after finishing: " + t1.getState()); // Should be TERMINATED
    }
}
