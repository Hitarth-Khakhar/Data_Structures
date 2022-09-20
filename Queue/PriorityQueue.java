import java.util.*;

public class PriorityQueue {

    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(60);
        pq.add(70);

        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}