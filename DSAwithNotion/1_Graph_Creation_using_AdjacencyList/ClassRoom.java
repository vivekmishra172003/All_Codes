import java.util.*;
public class ClassRoom {

    static class Edge{
        int src;
        int dest;
        int weight;
        public  Edge (int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        
    }
}