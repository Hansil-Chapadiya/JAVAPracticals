public class Number extends Thread {
    private int enrollmentNo;

    public Number(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    @Override
    public void run() {
        if (enrollmentNo % 2 == 0) {
            // Display even numbers
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even Number: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Display odd numbers
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd Number: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two Number objects with even and odd enrollment numbers
        Number a1 = new Number(1001); // Odd enrollment number
        Number a2 = new Number(1002); // Even enrollment number

        // Start the threads
        a1.start();
        a2.start();
    }
}
