public class MyStack<T> {
    private T[] data;
    private int top;

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        data = (T[]) new Object[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T value) {
        data[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return data[top--];
    }
}
