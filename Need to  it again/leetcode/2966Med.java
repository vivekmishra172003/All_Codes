class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length, m = n / 3;
        int[][] result = new int[m][3];
        int id = 0;

        Arrays.sort(nums);

        for(int i = 0;i < n;i += 3) {

            int j = i + 2;

            if(nums[j] - nums[i] > k) {
                return new int[][]{};
            } else {
                result[id][0] = nums[i];
                result[id][1] = nums[i + 1];
                result[id][2] = nums[i + 2];
                id++;
            }
        }

        return result;
    }
}