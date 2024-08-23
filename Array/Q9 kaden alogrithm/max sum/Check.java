class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Initialize sum to 0 and max to the smallest possible value
        long sum = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
            // If the current sum is greater than max, update max
            if (sum > max) {
                max = sum;
            }
            
            // If the sum becomes negative, reset it to 0
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return max;
    }
}
