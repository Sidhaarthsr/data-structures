package adt.stack;

import java.util.EmptyStackException;

public class Stack {

    private int[] stack;
    private int top;

    /**
     * Constructor to create a stack with a given size.
     * 
     * @param size the size of the stack
     */
    public Stack(final int size) {
        stack = new int[size];
        top = -1;
    }

    /**
     * Pushes a value onto the top of the stack.
     * 
     * @param value the value to push
     */
    public void push(int value) {
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
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    /**
     * Returns the value at the top of the stack without removing it.
     * 
     * @return the value at the top of the stack
     */
    public int peek() {
        return stack[top];
    }

    /**
     * Returns whether the stack is empty.
     * 
     * @return
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

    /**
     * Removes all elements from the stack.
     */
    public void clear() {
        top = -1;
    }
}