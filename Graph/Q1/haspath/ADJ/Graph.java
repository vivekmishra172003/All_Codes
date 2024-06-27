import java.util.*;

public class Graph {
    private ArrayList<ArrayList<Integer>> graph;
    private int v;

    Graph(int v) {
        this.v = v;
        graph = new ArrayList<ArrayList<Integer>>(v); // Given the size
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    public void printA() {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // Corrected method to check if a path exists between start and finalVertex
    public boolean hasPath(int start, int finalVertex) {
        boolean visited[] = new boolean[graph.size()];
        return hasPathHelper(start, finalVertex, visited);
    }

    // Helper function for hasPath method
    private boolean hasPathHelper(int current, int finalVertex, boolean[] visited) {
        if (current == finalVertex) {
            return true;
        }
        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (hasPathHelper(neighbor, finalVertex, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        Graph graph = new Graph(v);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.printA();

        // Corrected the print statement and method call
        if (graph.hasPath(0, 6)) {
            System.out.println("Yes, there is a path.");
        } else {
            System.out.println("No, there is no path.");
        }
    }
}
