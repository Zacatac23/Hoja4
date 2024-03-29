package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 * This Java class reads an infix expression from a file, converts it to postfix notation, evaluates
 * the expression using a calculator singleton, and prints the result.
 */
public class CalculatorProgram {
    public static void main(String[] args) {
        // Lectura de la expresión infix desde datos.txt
        String infixExpression = readInfixExpressionFromFile("datos.txt");

        // Selección de la implementación de la Pila y la Lista
        String stackImplementation = "ArrayList";
        String listImplementation = "SinglyLinkedList";

        // Creación de la Pila y la Lista utilizando el patrón Factory
        UVGStack<Integer> stack = new StackFactory<Integer>().createStack(stackImplementation);
        List<Integer> list = new ListFactory<Integer>().createList(listImplementation);

        // Calculadora Singleton
        Calculator calculator = CalculatorSingleton.getInstance();

        // Conversión de infix a postfix y evaluación de la expresión
        String postfixExpression = infixToPostfix(infixExpression);
        int result = calculator.evaluateExpression(postfixExpression, stack, list);

        // Imprimir resultado
        System.out.println("El resultado de la expresión infix " + infixExpression + " es: " + result);
    }

    // The `readInfixExpressionFromFile` method in the Java class `CalculatorProgram` is responsible
    // for reading an infix expression from a file. Here's a breakdown of what it does:
    // The code snippet provided contains two methods in the `CalculatorProgram` Java class:
    // Método para leer la expresión infix desde el archivo
    private static String readInfixExpressionFromFile(String filename) {
        StringBuilder expression = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            expression.append(reader.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expression.toString();
    }

    // Método para convertir infix a postfix utilizando el algoritmo Shunting Yard
    static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char symbol : infixExpression.toCharArray()) {
            if (Character.isDigit(symbol)) {
                postfix.append(symbol);
            } else if (symbol == '(') {
                operatorStack.push(symbol);
            } else if (symbol == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop();  // Descartar '('
            } else {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(symbol)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(symbol);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    // The method `precedence(char operator)` in the Java class `CalculatorProgram` is determining the
    // precedence level of an operator in the context of converting an infix expression to postfix
    // notation using the Shunting Yard algorithm.
    // Método para obtener la precedencia de un operador
    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
