import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> Q = new LinkedList<>();
        Q.add("H");
        Q.add("i");
        Q.add("t");
        Q.add("a");
        Q.add("r");
        Q.add("t");
        Q.add("h");
        System.out.println("Elements in Queue:" + Q);

        System.out.println("remove method: " + Q.remove());

        System.out.println("peek method: " + Q.peek());

        System.out.println("poll method: " + Q.poll());

        System.out.println("element method: " + Q.element());

        System.out.println("Final Queue: " + Q);

        System.out.println("size: " + Q.size());

    }
}
