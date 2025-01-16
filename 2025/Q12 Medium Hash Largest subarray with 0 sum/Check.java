class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();//summation,index
            int sum =0;
            int maxL =0;
            int n = arr.length;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(sum==0){
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