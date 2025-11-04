public class MyLinkedList {
    Node head;

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public SplitResult splitEvenOdd() {
        MyLinkedList evens = new MyLinkedList();
        MyLinkedList odds  = new MyLinkedList();

        Node current = head;

        while (current != null) {
            if (current.data % 2 == 0) {
                evens.add(current.data);
            } else {
                odds.add(current.data);
            }
            current = current.next;
        }

        return new SplitResult(evens, odds);
    }
    public class SplitResult {
        public MyLinkedList evens;
        public MyLinkedList odds;

        public SplitResult(MyLinkedList evens, MyLinkedList odds) {
            this.evens = evens;
            this.odds = odds;
        }
    }
}
