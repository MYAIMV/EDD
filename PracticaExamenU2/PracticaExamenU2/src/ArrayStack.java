public class ArrayStack<T> {
    private Object[] array;
    private int size;

    public ArrayStack(int capacity) {
        array = new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T item) {
        if (size == array.length) throw new IllegalStateException("Stack is full");
        array[size++] = item;
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return (T) array[--size];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
