class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        int n = str.length();
        int tot = 0;
        for(int i =0;i<n;i++){
            char bit = str.charAt(n-1-i);
            if(bit == '1'){
                tot += Math.pow(2,i);
            }
        }
        return tot;
    }
}