import java.util.*;

public class Graph {

    private ArrayList<ArrayList<Integer>> adjList;

    // Constructor to initialize the graph
    public Graph(int numVertices) {
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Method to add an edge between two vertices
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // Method to display the adjacency list
    public void displayGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (int j : adjList.get(i)) {
                System.out.print(" -> " + j);
            }
            System.out.println();
        }
    }

    // Method to perform BFS traversal from a given start vertex
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[adjList.size()];  // Corrected 'vis' to 'visited'
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (!visited[curr]) {  // Corrected 'vis' to 'visited'
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int adjVertex : adjList.get(curr)) {  // Corrected the loop to iterate over adjList.get(curr)
                    if (!visited[adjVertex]) {  // Corrected 'vis' to 'visited'
                        queue.add(adjVertex);
                    }
                }
            }
        }
    }

    // Main method to test the graph and BFS traversal
    public static void main(String[] args) {
        System.out.println("Check");
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 4);

        graph.displayGraph();

        // Perform BFS traversal starting from vertex 0
        graph.BFS(0);
    }
}
