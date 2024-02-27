package org.example;
public class VectorStack<T> implements UVGStack<T> {
    private java.util.Vector<T> items;

    public VectorStack() {
        this.items = new java.util.Vector<>();
    }

    /**
     * The `isEmpty` function in Java checks if a collection of items is empty by delegating to the
     * `isEmpty` method of the `items` collection.
     * 
     * @return The `isEmpty()` method is returning a boolean value indicating whether the `items`
     * collection is empty or not.
     */
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * The `push` function adds an item to a stack and returns the item added.
     * 
     * @param item The `item` parameter represents the element that is being pushed onto the stack.
     * @return The method is returning the item that was pushed onto the stack.
     */
    @Override
    public T push(T item) {
        items.add(item);
        return item;
    }

    /**
     * This function removes and returns the top element of a stack if it is not empty, otherwise it
     * throws an exception.
     * 
     * @return The `pop()` method is returning the last element (of type T) from the stack.
     */
    /**
     * This function removes and returns the top element of a stack if it is not empty, otherwise it
     * throws an exception.
     * 
     * @return The `pop()` method is returning the last element (of type T) from the stack.
     */
    /**
     * This function removes and returns the top element of the stack if it is not empty, otherwise it
     * throws an exception.
     * 
     * @return The `pop()` method is returning the last element (top element) of the stack.
     */
    @Override
    public T pop() {
        if (!isEmpty()) {
            return items.removeLast();
        } else {
            throw new UnsupportedOperationException("pop from empty stack");
        }
    }

    /**
     * The `peek` function in Java returns the top element of a stack if it is not empty, otherwise it
     * throws an exception.
     * 
     * @return The `peek()` method is returning the last element in the stack (`items.getLast()`).
     */
    @Override
    public T peek() {
        if (!isEmpty()) {
            return items.getLast();
        } else {
            throw new UnsupportedOperationException("peek from empty stack");
        }
    }

    /**
     * This function returns the size of a collection named "items".
     * 
     * @return The `size()` method is being overridden to return the size of the `items` collection.
     */
    @Override
    public int size() {
        return items.size();
    }
}