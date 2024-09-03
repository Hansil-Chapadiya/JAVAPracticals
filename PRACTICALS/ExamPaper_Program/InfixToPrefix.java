import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        System.out.println("Enter Infix Expression:");
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        sc.close();

        ConvertOperation converter = new ConvertOperation();
        String prefix = converter.infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
    }
}

class ConvertOperation {

    public String infixToPrefix(String infix) {
        // Reverse the infix expression
        String reversedInfix = new StringBuilder(infix).reverse().toString();

        // Replace '(' with ')' and vice versa
        reversedInfix = replaceParentheses(reversedInfix);

        // Get the postfix expression of the modified infix
        String postfix = infixToPostfix(reversedInfix);

        // Reverse the postfix expression to get the prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    private String replaceParentheses(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                result.append(')');
            } else if (ch == ')') {
                result.append('(');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private int precedence(char ch) {
        switch (ch) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }
}
