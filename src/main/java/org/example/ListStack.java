package org.example;

public class ListStack<T> implements UVGStack<T> {
    private final java.util.Stack<T> items;

    public ListStack() {
        this.items = new java.util.Stack<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public T push(T item) {
        items.push(item);
        return item;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return items.pop();
        } else {
            throw new UnsupportedOperationException("pop from empty stack");
        }
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return items.peek();
        } else {
            throw new UnsupportedOperationException("peek from empty stack");
        }
    }

    @Override
    public int size() {
        return items.size();
    }
}
