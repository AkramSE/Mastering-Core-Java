/**
 * Demonstration of Thread Priorities in Java.
 * Priorities range from 1 (MIN) to 10 (MAX). 
 * Note: Exact execution order depends on the OS Thread Scheduler.
 */

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("Running: " + this.getName() + " (Priority: " + this.getPriority() + ")");
            i++;
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        System.out.println("---> Thread Priorities Demo <---");

        PriorityThread t1 = new PriorityThread("Thread_1 (Normal)");
        PriorityThread t2 = new PriorityThread("Thread_2 (MIN)");
        PriorityThread t3 = new PriorityThread("Thread_3 (MAX - Most Important)");

        // Setting Priorities
        t1.setPriority(Thread.NORM_PRIORITY); // Value: 5 (Default)
        t2.setPriority(Thread.MIN_PRIORITY);  // Value: 1
        t3.setPriority(Thread.MAX_PRIORITY);  // Value: 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
