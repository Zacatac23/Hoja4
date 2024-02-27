package org.example;

/**
 * The `ListStack` class implements a stack using a `java.util.Stack` and provides methods for pushing,
 * popping, peeking, checking if empty, and getting the size of the stack.
 */
public class ListStack<T> implements UVGStack<T> {
    private final java.util.Stack<T> items;

    public ListStack() {
        this.items = new java.util.Stack<>();
    }

    /**
     * This function checks if a collection of items is empty by delegating to the `isEmpty()` method
     * of the underlying `items` collection.
     * 
     * @return The `isEmpty()` method is returning a boolean value indicating whether the `items`
     * collection is empty or not.
     */
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * The `push` method adds an item to the top of the stack and returns the item added.
     * 
     * @param item The `item` parameter represents the element that is being pushed onto the stack.
     * @return The method is returning the item that was pushed onto the stack.
     */
    @Override
    public T push(T item) {
        items.push(item);
        return item;
    }

    /**
     * This function pops and returns the top element of the stack if it is not empty, otherwise it
     * throws an exception.
     * 
     * @return The `pop()` method is returning the top element of the stack (`items`) if the stack is
     * not empty. If the stack is empty, it throws an `UnsupportedOperationException` with the message
     * "pop from empty stack".
     */
    @Override
    public T pop() {
        if (!isEmpty()) {
            return items.pop();
        } else {
            throw new UnsupportedOperationException("pop from empty stack");
        }
    }

    /**
     * The `peek` function in Java returns the top element of a stack if it is not empty, otherwise it
     * throws an exception.
     * 
     * @return The `peek()` method is returning the top element of the stack without removing it.
     */
    @Override
    public T peek() {
        if (!isEmpty()) {
            return items.peek();
        } else {
            throw new UnsupportedOperationException("peek from empty stack");
        }
    }

    /**
     * The `size()` function returns the number of items in a collection.
     * 
     * @return The `size()` method is returning the size of the `items` collection.
     */
    /**
     * This function returns the size of a collection named "items".
     * 
     * @return The `size()` method is returning the number of items in the collection `items`.
     */
    @Override
    public int size() {
        return items.size();
    }
}
