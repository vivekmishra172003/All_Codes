class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        // step 1 replace zero with -1;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        // step 2
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxL =0;
        int sum =0;
        for(int i =0;i<n;i++){
            sum = sum+arr[i];
            if(sum ==0){
                maxL = i+1;
            }
            
            if(map.containsKey(sum)){
                maxL = Math.max(maxL,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxL;
    }
}