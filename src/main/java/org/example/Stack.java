package org.example;

public interface Stack<T> {
    boolean isEmpty();
    T push(T item);
    T pop();
    T peek();

    int size();
}
