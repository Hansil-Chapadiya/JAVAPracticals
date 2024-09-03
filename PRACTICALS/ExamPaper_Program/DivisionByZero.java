public class DivisionByZero {
    public static void main(String[] args) {
        HandleException H1 = new HandleException(10.0, 0.0);
        H1.showNumbers();
        try {
            System.out.println("Result: " + H1.getResult());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

class HandleException {
    private Double n1, n2;

    HandleException() {
        this.n1 = 0.0;
        this.n2 = 0.0;
    }

    HandleException(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void showNumbers() {
        System.out.println("N1 = " + this.n1 + " \nN2 = " + this.n2);
    }

    public Double getResult() {
        if (this.n2 == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return this.n1 / this.n2;
    }
}
