class Solution {
    public int findIndex(int[] arr, int x) {
        // code
        int far = -1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(x == arr[i]){
                far = i+1;
            }
        }
        return far ;
    }
}
