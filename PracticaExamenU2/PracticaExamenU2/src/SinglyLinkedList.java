public class SinglyLinkedList<T> {
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    private Node head;

    public void addLast(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public T removeLast() {
        if (head == null) throw new IllegalStateException("List is empty");
        if (head.next == null) {
            T data = head.data;
            head = null;
            return data;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        T data = temp.next.data;
        temp.next = null;
        return data;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String toString() {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(" -> ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
