import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();

        deque.addFirst("r");
        deque.addLast("t");
        deque.push("a");
        deque.push("t");
        deque.push("i");
        deque.offerFirst("H");
        deque.offerLast("h");

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing first and last element: " + deque);
    }

}
