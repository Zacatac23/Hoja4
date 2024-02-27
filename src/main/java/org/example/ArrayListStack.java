package org.example;

import java.util.ArrayList;

/**
 * An implementation of the Stack interface using an ArrayList.
 *
 * @param <T> the type of elements in the stack
 */
public class ArrayListStack<T> implements UVGStack<T> {

    private final ArrayList<T> stack = new ArrayList<T>();

    /**
     * The `push` method adds an item to the stack and returns the item that was pushed.
     * 
     * @param item The `item` parameter represents the element that is being pushed onto the stack. In
     * the `push` method, this element is added to the top of the stack.
     * @return The item that was pushed onto the stack is being returned.
     */
    @Override
    public T push(T item) {
        stack.add(item);
        return item;  // Return the item that was pushed onto the stack
    }

    /**
     * This function removes and returns the top element of a stack, throwing an exception if the stack
     * is empty.
     * 
     * @return The `pop()` method is returning the element that is removed from the top of the stack.
     */
    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeLast();
    }

    /**
     * This function returns the top element of the stack without removing it, throwing an exception if
     * the stack is empty.
     * 
     * @return The `peek()` method is returning the top element of the stack without removing it.
     */
    @Override
    public T peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getLast();
    }

    /**
     * The `isEmpty` function in Java checks if a stack is empty and returns a boolean value
     * accordingly.
     * 
     * @return The `isEmpty()` method is being overridden to return whether the stack is empty or not.
     * It returns a boolean value indicating if the stack is empty.
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * This function returns the size of a stack.
     * 
     * @return The `size()` method is being overridden to return the size of the stack.
     */
    @Override
    public int size() {
        return stack.size();
    }
}
