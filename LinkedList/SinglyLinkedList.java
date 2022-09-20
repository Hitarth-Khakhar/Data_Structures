public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;
    }

    static void printlist(Node n) {
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        Node second = null;
        Node third = null;

        head = new Node();
        second = new Node();
        third = new Node();

        head.data = 2;
        head.next = second;

        second.data = 4;
        second.next = third;

        third.data = 6;
        third.next = null;

        printlist(head);
    }
}
