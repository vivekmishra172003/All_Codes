import java.util.*;

public class Check {
    public static int scheduleJobs(ArrayList<Job> arr){
        
    }
    public static void main(String[] args) {
        // Corrected the print statement
        System.out.println("Check the jobs");

        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job(1, 4, 20));
        arr.add(new Job(2, 5, 60));
        arr.add(new Job(3, 6, 70));
        arr.add(new Job(4, 6, 65));
        arr.add(new Job(5, 4, 25));
        arr.add(new Job(6, 2, 80));
        arr.add(new Job(7, 2, 10));
        arr.add(new Job(8, 2, 22));

        // Sorting the list according to profit
        Collections.sort(arr);

        // Corrected the for loop syntax
        for (Job j : arr) {
            System.out.println(j);
        }
    }

    int maxProfit = scheduleJobs(arr);
    System.out.println(maxProfit);
}

// Fixed syntax errors and added semicolons
class Job implements Comparable<Job> {
    int id; // Added semicolon
    int deadline; // Added semicolon
    int profit; // Added semicolon

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Job other) {
        // Sorting in descending order by profit
        return Integer.compare(other.profit, this.profit);
    }

    @Override
    public String toString() {
        // Corrected toString format
        return id + " (" + deadline + ") " + profit + " )";
    }
}
