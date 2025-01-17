class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefProduct = new int[n];
        int[] suffProduct = new int[n];
        int[] res = new int[n];
        // step 1 calculate the prefix proejct
        prefProduct[0] = 1;
        for(int i =1;i<n;i++){
            prefProduct[i]=arr[i-1]*prefProduct[i-1];
        }
        suffProduct[n-1]=1;
        for(int i = n-2;i>=0;i--){
            suffProduct[i]=suffProduct[i+1]*arr[i+1];
        }
         for (int i = 0; i < n; i++) {        // Multiply prefix and suffix products for each index
        res[i] = prefProduct[i] * suffProduct[i];
    }

    return res;    
    }
}