package adt.stack;

import java.util.EmptyStackException;

public class ArrayStack<E> {

    private E[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        stack = (E[]) new Object[capacity];
        top = -1;
    }

    /**
     * Pushes a value onto the top of the stack.
     * 
     * @param value the value to push
     */
    public void push(E value) {
        if (top == stack.length - 1) {
            throw new StackOverflowError();
        }
        stack[++top] = value;
    }

    /**
     * Removes the value at the top of the stack and returns it.
     * 
     * @return the value at the top of the stack
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        final E popped = stack[top];
        stack[top--] = null;
        return popped;
    }

    /**
     * Returns the value at the top of the stack without removing it.
     * 
     * @return the value at the top of the stack
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    /**
     * Returns true if the stack is empty.
     * 
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the number of elements in the stack.
     * 
     * @return the number of elements in the stack
     */
    public int size() {
        return top + 1;
    }
}
