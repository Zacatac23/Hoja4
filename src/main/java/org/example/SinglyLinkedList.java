package org.example;
class SinglyLinkedList<T> implements List<T> {
    // Implementar los métodos de la interfaz List
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

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