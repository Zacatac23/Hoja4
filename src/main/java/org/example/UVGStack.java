package org.example;

public interface UVGStack<T>{
    boolean isEmpty();
    T push(T item);
    T pop();
    T peek();

    int size();
}
