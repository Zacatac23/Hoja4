package org.example;

import java.util.ArrayList;

/**
 * An implementation of the Stack interface using an ArrayList.
 *
 * @param <T> the type of elements in the stack
 */
public class ArrayListStack<T> implements Stack<T> {

    private final ArrayList<T> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public T push(T item) {
        stack.add(item);
        return item;  // Return the item that was pushed onto the stack
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeLast();
    }

    @Override
    public T peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}
