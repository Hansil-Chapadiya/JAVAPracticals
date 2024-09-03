public class ExceptionHandling {
    void getNumber(int n) throws ArithmeticException {
        // if (n % 2 == 0) {
        // System.out.println("Number is even");
        // } else {
        // System.out.println("Number is odd");
        // }
        if (n < 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(n);
        }

    }

    public static void main(String args[]) {
        ExceptionHandling Ex1 = new ExceptionHandling();
        try {
            Ex1.getNumber(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Interrupted ");
        }
    }
}
