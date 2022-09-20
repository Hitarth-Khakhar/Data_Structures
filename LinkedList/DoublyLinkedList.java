

public class doublylinkedlist {

    static class Node {
        int data;
        Node next;
        Node prev;
    }

    static Node head;

    static void push(int new_data) {
        Node new_Node = new Node();
        new_Node.data = new_data;

        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }

    static void printlist(Node node) {
        Node last = null;
        System.out.println("traversal in forward direction");

        while (node != null) {
            System.out.println(" " + node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println("Traversal in backward direction");
        while (last != null) {
            System.out.println(" " + last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {

        head = null;
        push(2);
        push(4);
        push(6);

        printlist(head);
    }
}
