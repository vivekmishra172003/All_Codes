class Solution {
    void segregate0and1(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Increment left index until we find a 1
            while (left < right && arr[left] == 0) {
                left++;
            }
            
            // Decrement right index until we find a 0
            while (left < right && arr[right] == 1) {
                right--;
            }
            
            // Swap elements at left and right indices
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}
