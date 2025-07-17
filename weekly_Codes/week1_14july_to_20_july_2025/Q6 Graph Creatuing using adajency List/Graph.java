import java.util.*;
public class Graph{
    static   class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph , int v){
        for(int i =0;i<v;i++){
            graph.add(new ArrayList<Edge>());
        }
        graph.get(0).add(new Edge(0,1,5));
        graph.get(1).add(new Edge(1,2,1));
        graph.get(1).add(new Edge(1,3,3));
        graph.get(1).add(new Edge(1,0,5));

        graph.get(2).add(new Edge(2,1,1));
        graph.get(2).add(new Edge(2,3,1));
        graph.get(2).add(new Edge(2,4,2));


        graph.get(3).add(new Edge(3,1,3));
        graph.get(3).add(new Edge(3,2,1));
        graph.get(4).add(new Edge(4,2,2));
        
    }

    public static void main(String[] args){
        System.out.print("ram ram");
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        int v = 5;
        createGraph(graph,v);

        for(int i =0;i<v;i++){
            System.out.print("vertex "+i+" = ");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j).dest+" ");
            }
            System.out.println();

        }
    }
}