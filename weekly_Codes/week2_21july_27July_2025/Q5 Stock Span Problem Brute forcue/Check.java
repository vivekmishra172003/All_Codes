import java.util.*;
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<n;i++){
            int curr = arr[i];
            int k =0;
            for(int j =i;j>=0;j--){

                if(curr>=arr[j]){
                    k=k+1;
                }else{
                    break;
                }
            }
            al.add(k);
        }
        return al;
    }
}