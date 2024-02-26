package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class CalculatorProgramTest {
    @Test
    public void testInfixToPostfix() {
        String infixExpression = "(1+2)*9";
        String expectedPostfix = "12+9*";
        String actualPostfix = CalculatorProgram.infixToPostfix(infixExpression);
        assertEquals(expectedPostfix, actualPostfix);
    }

    @Test
    public void testEvaluateExpression() {
        Stack<Integer> stack = new ArrayListStack<>();
        List<Integer> list = new SinglyLinkedList<>();
        Calculator calculator = new Calculator();

        String postfixExpression = "12+9*";
        int expectedResult = 27;
        int actualResult = calculator.evaluateExpression(postfixExpression, stack, list);
        assertEquals(expectedResult, actualResult);
    }
}