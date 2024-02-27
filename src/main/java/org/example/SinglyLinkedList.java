package org.example;
/**
 * The `SinglyLinkedList` class in Java implements a singly linked list with methods to check if it's
 * empty, add a node at the beginning, and remove the first node.
 */
class SinglyLinkedList<T> implements List<T> {
    // Implementar los métodos de la interfaz List
    private Node<T> head;

    /**
     * This is a generic Node class in Java with a data field and a reference to the next Node.
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * The function checks if the linked list is empty by verifying if the head node is null.
     * 
     * @return The method is returning a boolean value that indicates whether the "head" node of a data
     * structure is null or not. If the "head" node is null, the method will return true, indicating
     * that the data structure is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * The `addFirst` method adds a new node with the given item at the beginning of the linked list.
     * 
     * @param item The `item` parameter in the `addFirst` method represents the data that you want to
     * add to the beginning of the linked list. It is the value that will be stored in the new node
     * that you are creating and inserting at the beginning of the list.
     */
    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    /**
     * The `removeFirst` function removes and returns the data from the first node of a linked list in
     * Java.
     * 
     * @return The method `removeFirst()` is returning the data of the node that was removed from the
     * beginning of the list.
     */
    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("removeFirst from empty list");
        }

        T removedData = head.data;
        head = head.next;
        return removedData;
    }

}