import java.util.*;

public class Graph {
    private ArrayList<ArrayList<Integer>> graph;
    private int v;

    // Constructor to initialize the graph with v vertices
    public Graph(int v) {
        this.v = v;
        graph = new ArrayList<ArrayList<Integer>>(v + 1);
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    // Method to add an edge between src and dest
    public void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    // Method to print the adjacency list of the graph
    public void printAdj() {
        for (int i = 1; i <= v; i++) {
            System.out.print(i + " :");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }

    // Method to check if the graph is bipartite using BFS
    public boolean isBipartite() {
        int[] col = new int[v + 1];
        Arrays.fill(col, -1);  // Initialize all colors as -1 (uncolored)
        
        // Iterate through all vertices to handle disconnected components
        for (int i = 1; i <= v; i++) {
            if (col[i] == -1) {  // Check if the node is uncolored
                if (!BfsBipartite(i, col)) {
                    return false;  // If any component is not bipartite, return false
                }
            }
        }
        return true;  // All components are bipartite
    }

    // BFS method to check bipartiteness from a given source
    private boolean BfsBipartite(int src, int[] col) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        col[src] = 0;  // Start coloring the source with color 0

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int j = 0; j < graph.get(node).size(); j++) {  // Use traditional for loop
                int neighbor = graph.get(node).get(j);
                if (col[neighbor] == -1) {  // If the neighbor is uncolored
                    col[neighbor] = col[node] == 0 ? 1 : 0;  // Use ternary operator for alternate coloring
                    queue.add(neighbor);
                } else if (col[neighbor] == col[node]) {  // If the neighbor has the same color
                    return false;  // The graph is not bipartite
                }
            }
        }
        return true;  // The component is bipartite
    }

    public static void main(String[] args) {
        int v = 8;
        Graph graph = new Graph(v);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 6);
        graph.addEdge(6, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(7, 8);
        graph.printAdj();
        System.out.println(graph.isBipartite());
    }
}
