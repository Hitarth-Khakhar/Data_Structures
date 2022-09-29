public class CircularQueue {

    int size = 5;
    int front, rear;
    int items[] = new int[size];

    CircularQueue() {
        front = -1;
        rear = -1;
    }

    boolean IsFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;

        }
        return false;
    }

    boolean IsEmpty() {
        if (front == -1)

            return true;
        else
            return false;

    }

    void EnQueue(int element) {
        if (IsFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)

                front = 0;
            rear = (rear + 1) % size;
            items[rear] = element;
            System.out.println("Inserted" + element);
        }
    }

    int DeQueue() {
        int element;
        if (IsEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    void Display() {

        int i;
        if (IsEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front - " + front);
            System.out.println("Items - ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear - " + rear);
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.DeQueue();

        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);
        q.EnQueue(4);
        q.EnQueue(5);

        q.EnQueue(6);
        q.EnQueue(7);

        q.Display();

        int element = q.DeQueue();

        if (element != -1) {
            System.out.println("Deleted Element is " + element);
        }
        q.Display();

        q.EnQueue(7);

        q.Display();

        q.EnQueue(8);
    }

}