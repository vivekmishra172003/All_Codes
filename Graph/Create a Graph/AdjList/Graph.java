import java.util.*;

public class Graph {
    // Graph represented as an ArrayList of ArrayLists of Edges
    private ArrayList<ArrayList<Edge>> graph;

    // Constructor to initialize the graph with 'v' vertices
    Graph(int v) {
        // Initialize the graph with 'v' vertices
        graph = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int src, int dest, int weight) {
        Edge edge1 = new Edge(src, dest, weight);
        Edge edge2 = new Edge(dest, src, weight);
        graph.get(src).add(edge1); // Add edge to the source vertex's list
        graph.get(dest).add(edge2); // Add edge to the destination vertex's list for undirected graph
    }

    // Method to print the adjacency list representation of the graph
    public void printGraph() {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : graph.get(i)) {
                System.out.print(" -> (" + edge.dest + ", " + edge.weight + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        int v = 5;
        Graph graph = new Graph(v);

        // Add edges to the graph
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 4, 3);
        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 5);
        graph.addEdge(1, 4, 6);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 8);

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }
}

// Class to represent an edge in the graph
class Edge {
    int src; // Source vertex of the edge
    int dest; // Destination vertex of the edge
    int weight; // Weight of the edge

    // Constructor to initialize the edge with source, destination, and weight
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}
