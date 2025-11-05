public class ArrayQueue<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        array = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T item) {
        if (size == array.length) throw new IllegalStateException("Queue is full");
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = (T) array[front];
        front = (front + 1) % array.length;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[(front + i) % array.length]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
