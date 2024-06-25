import java.util.*;
public class Car implements Comparable<Car> {
    private int x;
    private int y;
    private double d;
    Car(int x,int y){
        this.x = x;
        this.y = y;
        this.d = Math.sqrt(x*x + y*y);
    }
    @Override
    public int compareTo(Car other){
                // Compare cars based on distance d
        if(this.d < other.d) {
            return -1; // Return -1 if this car's distance is less
        } else if (this.d > other.d) {
            return 1; // Return 1 if this car's distance is greater
        } else {
            return 0; // Return 0 if distances are equal
        }
    }
    @Override
    public String toString(){
        return "distnc of cars are "+d+" ";
    }
    public static void main(String[] args){
        System.out.println("Check it");
        PriorityQueue<Car> pq = new PriorityQueue<>();
        pq.add(new Car(3,3));
        pq.add(new Car(5,-1));
        pq.add(new Car(-2,4));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Polling the queue to print elements in order
        }
    }
}