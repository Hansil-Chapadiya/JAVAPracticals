import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    // Start the stopwatch
    public void start() {
        this.startTime = LocalTime.now();
    }

    // Stop the stopwatch
    public void stop() {
        this.endTime = LocalTime.now();
    }

    // Get the elapsed time in milliseconds
    public long getElapsedTimeMillis() {
        if (startTime != null && endTime != null) {
            Duration duration = Duration.between(startTime, endTime);
            return duration.toMillis();
        } else {
            throw new IllegalStateException("Stopwatch has not been started and stopped properly.");
        }
    }

    // Get the elapsed time in seconds
    public long getElapsedTimeSeconds() {
        if (startTime != null && endTime != null) {
            Duration duration = Duration.between(startTime, endTime);
            return duration.getSeconds();
        } else {
            throw new IllegalStateException("Stopwatch has not been started and stopped properly.");
        }
    }

    // Main method to test the stopwatch
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // Simulate some time-consuming task
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopWatch.stop();
        System.out.println("Elapsed time in milliseconds: " + stopWatch.getElapsedTimeMillis());
        System.out.println("Elapsed time in seconds: " + stopWatch.getElapsedTimeSeconds());
    }
}
