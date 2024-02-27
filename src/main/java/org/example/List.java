package org.example;

// This code snippet is defining a generic interface named `List` with a type parameter `T`. The
// interface declares three methods:
// 1. `isEmpty()` method which returns a boolean indicating whether the list is empty or not.
// 2. `addFirst(T item)` method which adds an element of type `T` to the beginning of the list.
// 3. `removeFirst()` method which removes and returns the first element from the list.
public interface List<T> {
    boolean isEmpty();
    void addFirst(T item);
    T removeFirst();
}
