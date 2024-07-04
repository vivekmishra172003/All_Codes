import java.util.*;
public class Graph{
    private ArrayList<ArrayList<Integer>> graph;
    private int v;
    public Graph(int v){
        this.v = v;
        graph = new ArrayList<ArrayList<Integer>>(v+1);
        for(int i =0;i<=v;i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int src,int dest){
        graph.get(src).add(dest);
    }
    public void printAdj(){
        for(int i =1;i<=v;i++){
            System.out.print(i+" : ");
            for(int j =0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println("");
        }
    }
    public boolean dfsCheck(int node,boolean[] vis,boolean[] pathVis){
        vis[node]=true;
        pathVis[node]=true;
        for(int it : graph.get(node)){
            if(!vis[it]){
                if(dfsCheck(it,vis,pathVis)== true) return true;
            } else if(pathVis[it]){
                return true;
            }
        }
        pathVis[node] = false;
        return false;

    }
    public boolean detectCycle(){
        boolean vis[] = new boolean[v+1];
        boolean pathVis[] = new boolean[v+1];
        for(int i =1;i<=v;i++){
            if(!vis[i]){
                if(dfsCheck(i,vis,pathVis)==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Check the shit");
        int v = 10;
        Graph graph = new Graph(v);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(7, 5);
        graph.addEdge(8, 2);
        graph.addEdge(8, 9);
        graph.addEdge(9, 10);
        graph.addEdge(10, 8);
        graph.printAdj();
        boolean hasCycle = graph.detectCycle();
        System.out.println("Cycle detected: " + hasCycle);
    }
}