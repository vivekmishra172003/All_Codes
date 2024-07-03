import java.util.*;
public class Graph {
    private ArrayList<ArrayList<Integer>> graph;
    private int v;

    public Graph(int v) {
        this.v = v;
        graph = new ArrayList<ArrayList<Integer>>(v + 1);
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        graph.get(src).add(dest);
    }

    public void printAdj() {
        for (int i = 1; i <= v; i++) { // Changed from 0 to 1 and < v to <= v
            System.out.print(i + " : ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // Changed 'adj' to 'graph'
    public boolean dfsCheck(int node, int vis[], int pathVis[]) {
        vis[node] = 1;
        pathVis[node] = 1;
        for (int it : graph.get(node)) { // Changed 'adj' to 'graph'
            if (vis[it] == 0) {
                if (dfsCheck(it, vis, pathVis) == true) return true;
            } else if (pathVis[it] == 1) {
                return true;
            }
        }
        pathVis[node] = 0;
        return false;
    }

    public boolean detectCycle() {
        int vis[] = new int[v + 1];
        int pathVis[] = new int[v + 1];
        for (int i = 1; i <= v; i++) { // Changed from 0 to 1 and < v to <= v
            if (vis[i] == 0) {
                if (dfsCheck(i, vis, pathVis) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Check it");
        int v = 10;
        Graph graph = new Graph(v);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(7, 5);
        graph.addEdge(8, 2);
        graph.addEdge(8, 9);
        graph.addEdge(9, 10);
        graph.addEdge(10, 8);
        graph.printAdj();

        boolean b = graph.detectCycle(); // Added 'graph.' to call detectCycle() method
        System.out.println("Cycle detected: " + b); // Added to print the result
    }
}
