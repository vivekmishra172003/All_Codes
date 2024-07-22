class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int l =0;
        int r = K-1;
        long maxsum = 0;
        for(int i =0;i<=r;i++){
            maxsum = maxsum + Arr.get(i);
        }
        long windowsum = maxsum;
        while(r<N-1){
            l++;
            r++;
            windowsum = windowsum + Arr.get(r) - Arr.get(l-1);
            maxsum = Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
}