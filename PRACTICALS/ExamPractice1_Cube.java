public class ExamPractice1_Cube {
    public static void main(String[] args) {
        try {
            // Check if there are enough command line arguments
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide two integers as command line arguments.");
            }

            // Parsing command-line arguments to integers
            Integer val1 = Integer.parseInt(args[0]);
            Integer val2 = Integer.parseInt(args[1]);

            // Displaying the sum of val1 and val2
            System.out.println("Sum of val1 and val2: " + (val1 + val2));

            // Checking if both arguments are integers
            if ((val1 instanceof Integer) && (val2 instanceof Integer)) {
                Integer cube = 1;
                // Calculating cube using a loop
                for (int i = 0; i < val2; i++) {
                    cube *= val1;
                }
                System.out.println("Cube = " + cube);
            } else {
                // If any of the arguments is not an integer, throw IllegalArgumentException
                throw new IllegalArgumentException("Arguments must be integers.");
            }
        } catch (IllegalArgumentException ie) {
            // Catching IllegalArgumentException and printing error message
            System.out.println(ie.getMessage());
        } catch (ArithmeticException ae) {
            // Catching ArithmeticException and printing error message
            System.out.println(ae.getMessage());
        } catch (Exception e) {
            // Catching other exceptions and printing error message
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Finally");
        }
    }
}
