import java.util.Iterator;
import java.util.LinkedList;

public class DFS {


    public int V;
    public LinkedList<Integer> adj[];

    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        DFS d = new DFS(5);
        d.addEdge(0, 1);
        d.addEdge(0, 3);
        d.addEdge(1, 0);
        d.addEdge(2, 2);
        d.addEdge(2, 4);
        d.addEdge(3, 0);
        d.addEdge(3, 1);
        d.addEdge(4, 0);
        d.DFS(2);
        System.out.println("This is DFS" + " from vertex 2" );
    }

}
