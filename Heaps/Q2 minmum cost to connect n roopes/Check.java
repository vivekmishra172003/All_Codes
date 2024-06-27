import java.util.*;
public class Check{
    public static void main(String[] args){
        int[] ropes = {4,3,2,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        Iterator<Integer> iterator = pq.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int cost =0;
        while(pq.size()>=2){
            int f = pq.poll();
            int s = pq.poll();
            int sum = f+s;
            cost =cost+ sum;
            pq.offer(sum);
        }
        System.out.println(cost);
    
    }
}

