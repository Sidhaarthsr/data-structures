package adt.stack;

/**
 * A stack implementation using a dynamic array.
 */
public class DynamicArrayStack<T> {
    private T[] array;
    private int top;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Default constructor to create a stack with a default capacity.
     */
    public DynamicArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructor to create a stack with a given capacity.
     * 
     * @param capacity the capacity of the stack
     */
    public DynamicArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.top = -1;
    }

    /**
     * Pushes an item onto the top of the stack.
     * 
     * @param item the item to push
     */
    public void push(T item) {
        ensureCapacity();
        array[++top] = item;
    }

    /**
     * Removes the item at the top of the stack and returns it.
     * 
     * @return the item at the top of the stack
     */
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        T poppedItem = array[top];
        array[top--] = null;
        return poppedItem;
    }

    /**
     * Returns the item at the top of the stack without removing it.
     * 
     * @return the item at the top of the stack
     */
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return array[top];
    }

    /**
     * Returns whether the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Returns the number of items in the stack.
     */
    private void ensureCapacity() {
        if (top == capacity - 1) {
            int newCapacity = capacity * 2;
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, capacity);
            array = newArray;
            capacity = newCapacity;
        }
    }
}