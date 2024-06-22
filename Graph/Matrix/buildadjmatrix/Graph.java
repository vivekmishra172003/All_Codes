import java.util.*;

public class Graph {
    private int[][] adjMatrix; // Adjacency matrix
    private int numVertices; // Number of vertices

    // Constructor to initialize the graph with a given number of vertices
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Method to add an edge between two vertices
    public void addEdge(int src, int dest, int weight) {
        adjMatrix[src][dest] = weight; // Add edge from src to dest with given weight
        adjMatrix[dest][src] = weight; // For undirected graph, add edge from dest to src with same weight
    }

    // Method to remove an edge between two vertices
    public void removeEdge(int src, int dest) {
        adjMatrix[src][dest] = 0; // Remove edge from src to dest
        adjMatrix[dest][src] = 0; // For undirected graph, remove edge from dest to src
    }

    // Method to print the adjacency matrix
    public void printAdjMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to visually represent the graph (prints edges)
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    // Main method to test the graph implementation
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        // Adding edges
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 4, 1);

        // Printing adjacency matrix
        System.out.println("Adjacency Matrix:");
        graph.printAdjMatrix();

        // Printing visual representation of the graph
        System.out.println("\nGraph Representation:");
        graph.printGraph();
    }
}
