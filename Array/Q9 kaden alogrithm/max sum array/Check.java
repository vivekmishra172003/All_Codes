class Solution {

    // Function to find the sum of the contiguous subarray with the maximum sum and print the subarray.
    static void maxSubarraySum(int[] arr) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            // Update max if the current sum is greater than max
            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }
            
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }
        
        // Print the maximum subarray sum
        System.out.println("Maximum Subarray Sum: " + max);
        
        // Print the subarray with the maximum sum
        System.out.print("Subarray with Maximum Sum: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};  // Example input array
        maxSubarraySum(arr);
    }
}
