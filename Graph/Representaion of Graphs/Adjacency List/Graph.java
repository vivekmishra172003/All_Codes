import java.util.ArrayList;
import java.util.List;

// Class to represent an edge in the graph
class Edge {
    int dest; // Destination vertex
    int weight; // Weight of the edge

    // Constructor
    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + dest + ", " + weight + ")";
    }
}

// Class to represent a graph
class Graph {
    // An array of lists to represent the adjacency list
    private ArrayList<Edge>[] adjList;

    // Constructor to initialize the graph
    @SuppressWarnings("unchecked")
    public Graph(int numVertices) {
        // Initialize the adjacency list array
        adjList = new ArrayList[numVertices];
        // Create a new list for each vertex
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // Method to add an edge between two vertices with a weight
    public void addEdge(int src, int dest, int weight) {
        // Add an edge from src to dest
        adjList[src].add(new Edge(dest, weight));
        // For undirected graph, add an edge from dest to src as well
        adjList[dest].add(new Edge(src, weight));
    }

    // Method to display the adjacency list
    public void displayGraph() {
        for (int i = 0; i < adjList.length; i++) {
            System.out.print("Vertex " + i + ":");
            for (Edge edge : adjList[i]) {
                System.out.print(" -> " + edge);
            }
            System.out.println();
        }
    }

    // Main method to test the graph
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges to the graph with weights
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 20);
        graph.addEdge(1, 2, 30);
        graph.addEdge(1, 3, 40);
        graph.addEdge(1, 4, 50);
        graph.addEdge(2, 3, 60);
        graph.addEdge(3, 4,50);
