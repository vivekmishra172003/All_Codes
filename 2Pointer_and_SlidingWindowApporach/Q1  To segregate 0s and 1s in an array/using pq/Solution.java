import java.util.PriorityQueue;

class Solution {
    void segregate0and1(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Adding elements to the priority queue
        for (int num : arr) {
            pq.offer(num);
        }
        
        // Polling elements from the priority queue back into the array
        int index = 0;
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }
}
