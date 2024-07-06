import java.util.*;
public class Graph{
    private ArrayList<ArrayList<Integer>> graph;
    private int v;
    public Graph(int v){
        this.v = v;
        graph = new ArrayList<ArrayList<Integer>>(v+1);
        for(int i=0;i<=v;i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int src,int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    public void printAdj(){
        for(int i =1;i<=v;i++){
            System.out.print(i+" :");
            for(int j =0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int v = 8;
        Graph graph = new Graph(v);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,6);
        graph.addEdge(6,5);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(4,7);
        graph.addEdge(7,8);
        graph.printAdj();
    }
}