import java.util.*; // Import the utility package for using data structures like ArrayList, Queue, etc.

public class Graph {
    private ArrayList<ArrayList<Integer>> adj; // Declaration of adjacency list

    Graph(int v) {
        adj = new ArrayList<ArrayList<Integer>>(); // Initialize the adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>()); // Add a new list for each vertex
        }
    }

    public void addEdge(int src, int dest) {
        adj.get(src).add(dest); // Add an edge from source to destination
        adj.get(dest).add(src); // Add an edge from destination to source (undirected graph)
    }

    public void printADJ() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " : "); // Print the current vertex
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " "); // Print all adjacent vertices
            }
            System.out.println(); // Print a new line after each vertex's adjacency list
        }
    }

    public void BFS() {
        boolean[] visited = new boolean[adj.size()]; // Create a visited array to keep track of visited nodes
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) { // If the node is not visited
                BFSUtil(i, visited); // Perform BFS from this node
            }
        }
    }

    public void BFSUtil(int v, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>(); // Create a queue for BFS
        visited[v] = true; // Mark the starting node as visited
        q.add(v); // Enqueue the starting node

        while (!q.isEmpty()) {
            int node = q.poll(); // Dequeue a vertex from the queue
            System.out.print(node + " "); // Print the dequeued vertex

            for (int neighbor : adj.get(node)) { // Iterate through all adjacent vertices
                if (!visited[neighbor]) { // If the adjacent vertex is not visited
                    visited[neighbor] = true; // Mark it as visited
                    q.add(neighbor); // Enqueue the adjacent vertex
                }
            }
        }
        System.out.println(); // Print a new line after completing BFS from a starting node
    }

    public static void main(String[] args) {
        System.out.println("Check the graph"); // Print a starting message
        int v = 7; // Number of vertices
        Graph graph = new Graph(v); // Create a new graph with 7 vertices
        graph.addEdge(0, 1); // Add edge between vertex 0 and 1
        graph.addEdge(0, 2); // Add edge between vertex 0 and 2
        graph.addEdge(1, 3); // Add edge between vertex 1 and 3
        graph.addEdge(3, 5); // Add edge between vertex 3 and 5
        graph.addEdge(3, 4); // Add edge between vertex 3 and 4
        graph.addEdge(4, 2); // Add edge between vertex 4 and 2
        graph.addEdge(4, 5); // Add edge between vertex 4 and 5
        graph.addEdge(6, 5); // Add edge between vertex 6 and 5
        graph.printADJ(); // Print the adjacency list of the graph
        graph.BFS(); // Perform BFS on the graph
    }
}
