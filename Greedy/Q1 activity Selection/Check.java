import java.util.*;

public class Check {
    public static void main(String[] args) {
        System.out.println("Check");
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 5, 7, 9, 9};

        // already sorted according to end time
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Select the first activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        // Iterate through the activities to find non-overlapping activities
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // Activity selected
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activities = " + maxAct);

        // Printing the indices of the selected activities
        for (int var : ans) {
            // Corrected the print statement to use the index directly
            System.out.print("A" + var + " ");
        }
        System.out.println();
    }
}

// sort according to end time
// select 1st activity(accoding to end time)
//  select non-overlapping  new activety slection rule start time >= last chosen end time
// count++