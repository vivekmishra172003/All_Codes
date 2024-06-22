import java.util.*;
public class Graph{
    private ArrayList<ArrayList<Integer>> adj ;
    Graph(int v){
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int src,int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }
    public  void printADJ(){
        for(int i =0;i<adj.size();i++){
            System.out.print(i+" : ");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public void BFS(){
        boolean[] visited = new boolean[adj.size()];
        for(int i =0;i<adj.size();i++){
            if(!visited[i]){
                BFSUtil(i,visited);
            }
        }
    }
    public void BFSUtil(int v,boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");
            for(int neighbor : adj.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Check the shit");
        // zero base indexing
        int v = 7;
        Graph graph = new Graph(v);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(3,5);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(6,5);
        graph.printADJ();
        graph.BFS();
    }
}