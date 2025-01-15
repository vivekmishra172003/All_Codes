class Solution {

    public static int smallestSubWithSum(int targetSum, int[] nums) {
        // Your code goes here
        int n = nums.length;
        int currentWindowSum=0;
        int windowStart =0;
        int minSubarrayLength = Integer.MAX_VALUE;
        for(int windowEnd=0; windowEnd<n;windowEnd++){
            currentWindowSum = currentWindowSum+nums[windowEnd];
            while(currentWindowSum>targetSum){
                minSubarrayLength = Math.min(minSubarrayLength,windowEnd-windowStart+1);
                currentWindowSum=currentWindowSum-nums[windowStart];
                windowStart++;
            }
        }
        return (minSubarrayLength == Integer.MAX_VALUE) ? 0 : minSubarrayLength;
    }
}