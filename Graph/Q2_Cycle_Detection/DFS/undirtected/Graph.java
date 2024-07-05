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
        graph.get(dest).add(src);
    }

    public void printAdj() {
        for (int i = 1; i <= v; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }

    public boolean dfsCheck(int node, int parent, boolean[] vis) {
        vis[node] = true;
        for (int adjNode : graph.get(node)) {
            if (!vis[adjNode]) {
                if (dfsCheck(adjNode, node, vis)) {
                    return true; // Cycle detected
                }
            } else if (adjNode != parent) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected
    }

    public boolean detectCycle() {
        boolean vis[] = new boolean[v + 1];
        for (int i = 1; i <= v; i++) {
            if (!vis[i]) { // Check if the node is already visited
                if (dfsCheck(i, -1, vis)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle detected in the graph
    }

    public static void main(String[] args) {
        int v = 7;
        Graph graph = new Graph(v);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 6);
        graph.addEdge(7, 5);
        graph.addEdge(7, 6);
        graph.printAdj();
        boolean cycleDetected = graph.detectCycle();
        System.out.println("Cycle detected: " + cycleDetected); // Print result
    }
}
