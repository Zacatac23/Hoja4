package org.example;

/**
 * The `ListFactory` class creates instances of different types of lists based on the specified
 * implementation.
 */
class ListFactory<T> {
    /**
     * The function creates a list based on the specified implementation type.
     * 
     * @param implementation The `implementation` parameter is a String that specifies the type of list
     * implementation to create. It can have values "SinglyLinkedList" or "DoublyLinkedList".
     * @return A List of type T is being returned based on the implementation specified in the input
     * parameter. If the implementation is "SinglyLinkedList", a new SinglyLinkedList instance is
     * returned. If the implementation is "DoublyLinkedList", a new DoublyLinkedList instance is
     * returned. If the implementation does not match either of these options, an
     * IllegalArgumentException is thrown with the message "Invalid list implementation".
     */
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