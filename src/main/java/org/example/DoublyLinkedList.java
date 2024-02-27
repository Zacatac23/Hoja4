package org.example;


/**
 * The class `DoublyLinkedList` implements a doubly linked list with generic type elements in Java.
 */
class DoublyLinkedList<T> implements List<T> {
    // Implementar los métodos de la interfaz List
    private Node<T> head;
    private Node<T> tail;

    /**
     * This class represents a node in a doubly linked list with generic data type.
     */
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    /**
     * The function checks if the linked list is empty by verifying if the head node is null.
     * 
     * @return The method `isEmpty()` is returning a boolean value, which indicates whether the `head`
     * of the data structure is null or not. If the `head` is null, the method will return `true`,
     * indicating that the data structure is empty. If the `head` is not null, the method will return
     * `false`, indicating that the data structure is not empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * The addFirst method adds a new node with the specified item at the beginning of a doubly linked
     * list.
     * 
     * @param item The `item` parameter in the `addFirst` method represents the data that you want to
     * add to the beginning of the linked list. It is the value that will be stored in the new node
     * that is being added to the list.
     */
    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * This function removes and returns the data stored in the first node of a doubly linked list.
     * 
     * @return The `removeFirst` method is returning the data of the node that was removed from the
     * beginning of the list.
     */
    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("removeFirst from empty list");
        }

        T removedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return removedData;
    }
}