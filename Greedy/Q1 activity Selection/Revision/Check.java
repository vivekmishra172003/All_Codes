import java.util.*;

public class Check {
    class Activity implements Comparable<Activity> {
        int start;
        int end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Activity other) {
            if (this.end < other.end) {
                return -1;
            } else if (this.end > other.end) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Start time is " + start + ", end time is: " + end;
        }
    }

    public static void main(String[] args) {
        Check check = new Check();

        int start[] = {1, 3, 2, 5};
        int end[] = {2, 4, 3, 6};

        List<Activity> ls = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            ls.add(check.new Activity(start[i], end[i]));
        }

        Collections.sort(ls);

        System.out.println("All activities sorted by end time:");
        for (Activity a : ls) {
            System.out.println(a);
        }

        // Apply activity selection algorithm
        System.out.println("\nSelected activities:");

        // The first activity always gets selected
        Activity lastSelected = ls.get(0);
        System.out.println(lastSelected);
        int count = 1; // Initialize count to include the first selected activity

        for (int i = 1; i < ls.size(); i++) {
            Activity currentActivity = ls.get(i);
            if (currentActivity.start >= lastSelected.end) {
                System.out.println(currentActivity);
                lastSelected = currentActivity;
                count++; // Increment count for each selected activity
            }
        }

        // Print the number of activities that can be completed
        System.out.println("\nNumber of activities that can be completed: " + count);
    }
}
