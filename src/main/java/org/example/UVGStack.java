package org.example;

// This code snippet is defining a generic interface named `UVGStack` in Java. It specifies a set of
// methods that a class implementing this interface must provide:
public interface UVGStack<T>{
    boolean isEmpty();
    T push(T item);
    T pop();
    T peek();

    int size();
}
