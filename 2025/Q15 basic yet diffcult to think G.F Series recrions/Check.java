//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    // Function to generate and print the G.F Series
    static void gfSeries(int N) {
        // Initialize the first two terms of the series
        long a = 0; // First term (T1)
        long b = 1; // Second term (T2)

        // Use StringBuilder to store the result efficiently
        StringBuilder result = new StringBuilder();

        // Add the first term to the result
        result.append(a).append(" "); // Append T1 with a space

        // Add the second term to the result if N > 1
        if (N > 1) {
            result.append(b).append(" "); // Append T2 with a space
        }

        // Generate the rest of the series from T3 to TN
        for (int i = 3; i <= N; i++) {
            long c = a * a - b; // Compute the next term using Tn = (Tn-2)^2 - Tn-1
            result.append(c).append(" "); // Append the term to the result
            a = b; // Update a to Tn-1 for the next iteration
            b = c; // Update b to Tn for the next iteration
        }

        // Print the result as a single line
        System.out.println(result.toString().trim()); // Remove trailing space
    }
}
