import java.util.*;
public class Graph{
    private ArrayList<ArrayList<Integer>> adjList;

    Graph(int numV){
        adjList = new ArrayList<>(numV);
        for(int i =0;i<numV;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int src,int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    public void printAdj(){
        for(int i =0;i<adjList.size();i++){
            System.out.print(i+":  ");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println("");
        }
    }
    public void DFS(int start){
        boolean[] visited = new boolean[adjList.size()];
        dfsUtil(start,visited);
    }
    private void dfsUtil(int v,boolean[] visited){
        visited[v]= true;
        System.out.print(v+" ");
        for(int neighbor: adjList.get(v)){
            if(!visited[neighbor]){
                dfsUtil(neighbor,visited);
            }
        }
    }
    public static void main(String[] args){
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 4);
        graph.printAdj();
        graph.DFS(0);
    }
}