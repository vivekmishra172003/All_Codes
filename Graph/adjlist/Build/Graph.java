import java.util.*;

public class Graph {
    
    private ArrayList<ArrayList<Integer>> adj; // Adjacency list to store graph edges

    // Constructor to initialize the graph with a given number of vertices
    Graph(int v) {
        adj = new ArrayList<ArrayList<Integer>>(); // Initialize the adjacency list
        for (int i = 0; i <= v; i++) { 
            adj.add(new ArrayList<Integer>()); // Add an empty list for each vertex
        }
    }

    // Method to add an edge to the graph
    // This method should not be static as it operates on the instance variable adj
    public void addEdge(int src, int dest) {
        adj.get(src).add(dest); // Add dest to src's list
        adj.get(dest).add(src); // Add src to dest's list (for undirected graph)
    }

    // Method to print the adjacency list of the graph
    // This method should not be static as it operates on the instance variable adj
    public void printAdjList() {
        for (int i = 0; i < adj.size(); i++) { // Corrected adj.list to adj.size()
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // The DFS traversal method that handles disconnected graphs
    public void DFS() {
        boolean[] visited = new boolean[adj.size()]; // Mark all the vertices as not visited

        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i = 1; i < adj.size(); i++) { // Start from 1 to n (1-indexed vertices)
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    // Utility function for DFS
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true; // Mark the current node as visited
        System.out.print(v + " "); // Print the visited node

        // Recur for all the vertices adjacent to this vertex
        for (int i : adj.get(v)) {
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 5; // Number of vertices
        int m = 3; // Number of edges (not used in this implementation)
        
        Graph graph = new Graph(n); // Create a graph with n vertices

        // Add edges to the graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);

        // Print the adjacency list of the graph
        graph.printAdjList();

        // Perform DFS traversal
        System.out.println("DFS traversal of the graph:");
        graph.DFS();

        System.out.println("\nCheck");
    }
}
