class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n = arr.length;
        int l =0;
        int h = k;
        
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<=n-k;i++){
            for(int j =l;j<h;j++){
                set.add(arr[j]);
            }
            al.add(set.size());
            set.clear();
            l++;
            h++;
        }
        return al;
    }
}