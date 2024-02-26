package org.example;
import java.util.List;

class ListFactory<T> {
    public List<T> createList(String implementation) {
        if ("SinglyLinkedList".equals(implementation)) {
            return new SinglyLinkedList<>();
        } else if ("DoublyLinkedList".equals(implementation)) {
            return new DoublyLinkedList<>();
        } else {
            throw new IllegalArgumentException("Invalid list implementation");
        }
    }
}