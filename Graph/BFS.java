import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    public int V;
    public LinkedList<Integer> adj[];

    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int b) {
        adj[v].add(b);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);

                }

            }
        }

    }

    public static void main(String[] args) {
        BFS b = new BFS(5);
        b.addEdge(0, 1);
        b.addEdge(0, 3);
        b.addEdge(1, 0);
        b.addEdge(2, 2);
        b.addEdge(2, 4);
        b.addEdge(3, 0);
        b.addEdge(3, 1);
        b.addEdge(4, 0);
        b.BFS(2);
        System.out.println("This is BFS " + "From vertex 2");
    }
}
