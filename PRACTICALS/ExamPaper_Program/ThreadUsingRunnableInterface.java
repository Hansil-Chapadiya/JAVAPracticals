public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        /*
         * Thread th1 = new Thread(new Runnable() {
         *
         * @Override
         * public void run() {
         * print_();
         * }
         *
         * public void print_() {
         * final Object lock = new Object();
         * synchronized (lock) {
         * ;
         * for (int i = 0; i <= 10; i++) {
         * System.out.print(i + " ");
         * }
         * try {
         * Thread.sleep(300);
         * } catch (Exception e) {
         * System.out.println(e.getMessage());
         * }
         * }
         * }
         * });
         * th1.start();
         */
        RunnableInterface th1 = new RunnableInterface();
        th1.run();
        th1.run();
    }
}

class RunnableInterface implements Runnable {
    @Override
    public void run() {
        print_();

    }

    public void print_() {
        final Object lock = new Object();
        synchronized (lock) {
            ;
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("");

        }
    }
}
