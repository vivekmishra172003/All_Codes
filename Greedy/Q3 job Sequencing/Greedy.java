import java.util.*;
public class Greedy{
    public static void main(String[] args){
        System.out.println("Check");f
    }
}
class Job implements Comparable<Job> {
    int id;
    int deadline;
    int profit;
    Job(int id,int deadline,int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    @Override
    public int compareTo(Job other){
        return Integer.compare(other.marks,this.mark);
    }
}