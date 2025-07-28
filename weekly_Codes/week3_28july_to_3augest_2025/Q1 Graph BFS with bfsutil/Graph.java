/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Graph
{

    public static void addEdge(ArrayList<ArrayList<Integer>> graph,int u , int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
        
    }
    
    public static void bfsUtil(ArrayList<ArrayList<Integer>> graph,boolean[] visited , int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int node = q.poll();
            
             System.out.print(node + " ");
             for(int i =0;i<graph.get(node).size();i++){
                 if(!visited[graph.get(node).get(i)]){
                     visited[graph.get(node).get(i)]=true;
                     q.offer(graph.get(node).get(i));
                 }
                 
             }
        }
    }
    
    
    public static void bfs(ArrayList<ArrayList<Integer>> graph,int v , int start){
        boolean visited[] = new boolean[v+1];
        
        bfsUtil(graph,visited,start);
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int v =10;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	   for(int i =0;i<=v;i++){
            graph.add(new ArrayList<Integer>());
        }
	    addEdge(graph,1,2);
	    addEdge(graph,1,7);
	    addEdge(graph,2,3);
	    addEdge(graph,2,6);
	    addEdge(graph,3,4);
	    addEdge(graph,3,5);
	    addEdge(graph,7,8);
	    addEdge(graph,7,10);
	    addEdge(graph,8,9);
	    
	    for(int i =1;i<=v;i++){
	        System.out.print("ADj of "+i+" is  =");
	        for(int j =0;j<graph.get(i).size();j++){
	            System.out.print(graph.get(i).get(j)+" ");
	        }
	        System.out.println();
	    }
	    
	    bfs(graph, v, 1);
	    
		
		
	}
} 