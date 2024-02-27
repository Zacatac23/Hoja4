package org.example;

/**
 * The `Calculator` class evaluates a postfix expression using a stack and performs arithmetic
 * operations.
 */
public class Calculator {
    public int evaluateExpression(String postfixExpression, UVGStack<Integer> stack, List<Integer> list) {
        for (char symbol : postfixExpression.toCharArray()) {
            if (Character.isDigit(symbol)) {
                stack.push(Character.getNumericValue(symbol));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, symbol);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    // The `performOperation` method in the `Calculator` class is responsible for performing arithmetic
    // operations based on the given operands and operator. It takes two operands (`operand1` and
    // `operand2`) and an operator as input parameters and then uses a switch statement to determine
    // which operation to perform based on the operator.
    private int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
