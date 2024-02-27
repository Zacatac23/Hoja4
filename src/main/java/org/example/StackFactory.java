package org.example;
/**
 * A factory class to create a stack of a specified implementation.
 *
 * @param <T> the type of elements in the stack
 */
public class StackFactory<T> {

    /**
     * Creates a stack of the specified implementation.
     *
     * @param implementation the type of stack to create. Supported values are "ArrayList", "Vector", and "List".
     * @return a stack of the specified implementation
     * @throws IllegalArgumentException if the implementation is not recognized
     */
    public UVGStack<T> createStack(String implementation) {
        if (implementation == null || implementation.isEmpty()) {
            throw new IllegalArgumentException("Implementation cannot be null or empty");
        }

        if ("ArrayList".equals(implementation)) {
            return new ArrayListStack<T>();
        } else if ("Vector".equals(implementation)) {
            return new VectorStack<T>();
        } else if ("List".equals(implementation)) {
            return new ListStack<T>();
        } else {
            throw new IllegalArgumentException("Invalid stack implementation");
        }
    }
}


