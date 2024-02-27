package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The class contains a test case for verifying the conversion of an infix expression to postfix and
 * evaluating a postfix expression using a calculator class.
 */
public class CalculatorProgramTest {
 /**
  * The test case verifies the conversion of an infix expression "(1+2)*9" to its corresponding postfix
  * expression "12+9*".
  */
    @Test
    public void testInfixToPostfix() {
        String infixExpression = "(1+2)*9";
        String expectedPostfix = "12+9*";
        String actualPostfix = CalculatorProgram.infixToPostfix(infixExpression);
        assertEquals(expectedPostfix, actualPostfix);
    }

    /**
     * The test evaluates a postfix expression using a stack and a list in a calculator class and
     * asserts the expected result with the actual result.
     */
    @Test
    public void testEvaluateExpression() {
        UVGStack<Integer> stack = new ArrayListStack<>();
        List<Integer> list = new SinglyLinkedList<>();
        Calculator calculator = new Calculator();

        String postfixExpression = "12+9*";
        int expectedResult = 27;
        int actualResult = calculator.evaluateExpression(postfixExpression, stack, list);
        assertEquals(expectedResult, actualResult);
    }
}