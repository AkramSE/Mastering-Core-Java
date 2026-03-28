/**
 * Demonstration of creating Threads in Java using two ways:
 * 1. By extending the Thread class
 * 2. By implementing the Runnable interface
 */

// --- Method 1: Extending Thread Class ---
class CookingThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) { // Reduced to 5 for clean console output
            System.out.println("Method 1: My Cooking Thread is Running! 🍳");
            i++;
        }
    }
}

// --- Method 2: Implementing Runnable Interface ---
class ChattingRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) { // Reduced to 5 for clean console output
            System.out.println("Method 2: Chatting with friends... 💬");
            i++;
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        System.out.println("---> Starting Threads <---");

        // 1. Starting Thread extending 'Thread' class
        CookingThread t1 = new CookingThread();
        t1.start();

        // 2. Starting Thread implementing 'Runnable' interface
        // Runnable requires a "Gun" (Thread object) to fire the "Bullet" (Runnable object)
        ChattingRunnable bullet = new ChattingRunnable();
        Thread gun = new Thread(bullet);
        gun.start();
    }
}
