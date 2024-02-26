package org.example;
import java.util.Stack;
public class VectorStack<T> extends Stack<T> {
    private java.util.Vector<T> items;

    public VectorStack() {
        this.items = new java.util.Vector<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public T push(T item) {
        items.add(item);
        return item;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return items.removeLast();
        } else {
            throw new UnsupportedOperationException("pop from empty stack");
        }
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return items.getLast();
        } else {
            throw new UnsupportedOperationException("peek from empty stack");
        }
    }
}