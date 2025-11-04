import java.util.Stack;

public class ArrayQueue<T> {

    private T[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = element;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T temp = data[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        Stack<T> stack = new Stack<>();
        while (!isEmpty()) {
            stack.push(dequeue());
        }
        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i<size; i++){
            int idx = (front + i) % capacity;
            sb.append(data[idx]);
            if(i < size-1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
