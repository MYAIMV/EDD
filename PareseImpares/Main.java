public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Original: ");
        list.printList();

        MyLinkedList.SplitResult result = list.splitEvenOdd();

        System.out.print("Pares: ");
        result.evens.printList();

        System.out.print("Impares: ");
        result.odds.printList();
    }
}
