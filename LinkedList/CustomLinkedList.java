package LinkedList;

public class CustomLinkedList {

    Node head;

    public void Insert(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = NewNode;
        }
    }

    public void InsertHead(int data) {
        Node NewNode = new Node(data);

        NewNode.next = head;
        head = NewNode;
    }

    public void InsertAt(int data, int index) {
        if (index == 0) {
            InsertHead(data);
        } else {
            Node newNode = new Node(data);
            Node currentNode = head;
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void Delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index -1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    public void Show() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("LinkedList is empty");
        } else {
            while (currentNode != null) {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }

}
