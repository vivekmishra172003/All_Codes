class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Check if the array is empty or k is greater than array length
        if (arr.length == 0 || k > arr.length) {
            return -1;
        }
        
        int n = arr.length;
        int maxSum = 0;
        int windowSum = 0;

        // Compute the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // Update the window sum
            maxSum = Math.max(maxSum, windowSum); // Update the maximum sum
        }

        return maxSum;
    }
}