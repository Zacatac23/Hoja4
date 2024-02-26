package org.example;
import java.util.List;
import java.util.Stack;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StackFactory<Integer> stackFactory = new StackFactory<>();
        ListFactory<Integer> listFactory = new ListFactory<>();

        String stackImplementation = "ArrayList";  // Seleccionar la implementación de la pila
        String listImplementation = "SinglyLinkedList";  // Seleccionar la implementación de la lista

        Stack<Integer> stack = stackFactory.createStack(stackImplementation);
        List<Integer> listImpl = listFactory.createList(listImplementation);

        Calculator calculator = CalculatorSingleton.getInstance();

        // Resto del código, incluyendo la lectura de la expresión infix desde datos.txt y el cálculo
        // Utiliza el stack y listImpl según sea necesario
        // Asegúrate de realizar pruebas unitarias con JUnit para las clases de implementación de la pila y la clase lista
    }
}
