class Solution {
    public static int findSum(int n) {
        // code here
        // base caes
        if(n==0 || n==1){
            return n;
        }
        // recursion call
        return n+findSum(n-1);
    }
}
