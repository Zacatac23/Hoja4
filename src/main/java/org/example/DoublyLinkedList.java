package org.example;


class DoublyLinkedList<T> implements List<T> {
    // Implementar los métodos de la interfaz List
    private Node<T> head;
    private Node<T> tail;

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

    @Override
    public boolean isEmpty() {
        return head == null;
    }

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