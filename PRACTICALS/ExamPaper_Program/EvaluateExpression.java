import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java EvaluateExpression \"<expression>\"");
            return;
        }

        String infix = args[0];
        try {
            String postfix = infixToPostfix(infix);
            double result = evaluatePostfix(postfix);
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Invalid expression: " + e.getMessage());
        }
    }

    private static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        // Character postfixCharacter[] = new Character[20];
        int i = 0;

        while (i < infix.length()) {
            char ch = infix.charAt(i);
            if (Character.isWhitespace(ch)) {
                i++;
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {
                StringBuilder number = new StringBuilder();
                while (i < infix.length() && Character.isLetterOrDigit(infix.charAt(i))) {
                    number.append(infix.charAt(i));
                    i++;
                }
                postfix.append(number).append(' ');
                i--;  // Adjust for the next iteration
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
            i++;
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString();
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) continue;

            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    case "^":
                        stack.push(Math.pow(a, b));
                        break;
                }
            }
        }

        return stack.pop();
    }
}
