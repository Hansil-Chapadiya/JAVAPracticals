public class CommandLineCalculator {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Enter two numeric arguments and one operator. For example: 12 10 +");
                return;
            }

            // Parsing the numeric arguments
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            char operator = args[2].charAt(0);
            double result = 0;

            // Performing the calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Error: Unsupported operator. Use +, -, *, /, or ^.");
                    return;
            }

            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numeric arguments.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
