public class ThreadTest {
    synchronized public void printNum() {
        // synchronized (this) {
        if (Thread.currentThread().getName().contentEquals("Thread-0")) {
            // System.out.println("EVEN NUMBERS");
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
            notify();
        } else if (Thread.currentThread().getName().contentEquals("Thread-1")) {
            // System.out.println("ODD NUMBERS");
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 1)
                    System.out.print(i + " ");
            }
            notify();
        }
    }

    public static void main(String[] args) {
        ThreadTest tt1 = new ThreadTest();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                tt1.printNum();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                tt1.printNum();
            }
        });
        // Thread th1 = new Thread(t1);
        // Thread th2 = new Thread(t2);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

// using synchronized block
/*
 * public class Main {
 * public void printEvenNum() {
 * synchronized (this) {
 * if (Thread.currentThread().getName().contentEquals("Thread-0")) {
 * // System.out.println("EVEN NUMBERS");
 * for (int i = 1; i <= 10; i++) {
 * if (i % 2 == 0)
 * System.out.print(i + " ");
 * }
 * notify();
 * }
 * };
 * }
 * public void printOddNum() {
 * synchronized (this) {
 * if (Thread.currentThread().getName().contentEquals("Thread-1")) {
 * // System.out.println("ODD NUMBERS");
 * for (int i = 1; i <= 10; i++) {
 * if (i % 2 == 1)
 * System.out.print(i + " ");
 * }
 * notify();
 * }
 * };
 * }
 * public static void main(String[] args) {
 * Main tt1 = new Main();
 * Thread t1 = new Thread(new Runnable() {
 * public void run() {
 * tt1.printEvenNum();
 * }
 * });
 * Thread t2 = new Thread(new Runnable() {
 * public void run() {
 * tt1.printOddNum();
 * }
 * });
 * t1.start();
 * t2.start();
 * }
 * }
 */
