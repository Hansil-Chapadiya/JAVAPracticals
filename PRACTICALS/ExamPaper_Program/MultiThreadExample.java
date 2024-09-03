public class MultiThreadExample {
    public static void main(String[] args) {
        ThreadExample th1 = new ThreadExample();
        th1.start();
        ThreadExample th2 = new ThreadExample();
        th2.start();
    }
}

class ThreadExample extends Thread {
    // Shared lock object for synchronization across all instances
    private static final Object lock = new Object();

    // Print numbers from 0 to 9 with delay
    void print_() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                // Thread.yield() - yield to other threads
                try {
                    Thread.sleep(300); // Sleep for 300 milliseconds
                } catch (InterruptedException e) {
                    // Handle exception
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(); // New line after printing numbers
        }
    }

    @Override
    public void run() {
        print_();
    }
}
