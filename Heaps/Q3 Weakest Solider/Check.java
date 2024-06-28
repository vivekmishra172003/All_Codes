import java.util.*;
public class Check{
    static class Battalion implements Comparable<Battalion>{
        int row;
        int sol;
        public Battalion(int row,int sol){
            this.row = row;
            this.sol = sol;
        }
        @Override
        public int compareTo(Battalion other){
            if(this.sol == other.sol){
                return Integer.compare(this.row,other.row);
            }else{
                return Integer.compare(this.sol,other.sol);
            }
        }
        @Override
        public String toString(){
            return "row is "+row +" and column is "+sol;
        }
        //- = no swap
        //+ = swap
        //0 = nothing
    }
    public static void main(String[] args){
        System.out.println("Check it");
        int[][] mat = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        PriorityQueue<Battalion> pq = new PriorityQueue<>();
        int sol =0;
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    sol++;
                }
                pq.add(new Battalion(i,sol));
            }
        }
        System.out.println(pq.peek());
    }
}