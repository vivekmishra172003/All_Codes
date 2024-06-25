import java.util.*;
public class Graph{
    private int[][] adjMatrix;
    private int numVertices;
    Graph(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }
    public  void addEdge(int src,int dest){
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }
    public  void printA(){
        for(int i =0;i<numVertices;i++){
            for(int j =0;j<numVertices;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void DFS(){
        boolean[] visited = new boolean[numVertices];
        for(int i =0;i<numVertices;i++){
            if(!visited[i]){
            DFSUtil(i,visited);
            }
        }
    }
    public void DFSUtil(int start,boolean[] visited){
        System.out.println(start+" ");
        visited[start] = true;
        for(int i =0;i<numVertices;i++){
            if(adjMatrix[start][i]==1 && !visited[i]){
                DFSUtil(i,visited);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Check it");
        // o based indexing
        int v = 7;
        Graph graph = new Graph(v);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.printA();
        graph.DFS();
    }
}