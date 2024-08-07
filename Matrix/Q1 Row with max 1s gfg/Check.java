class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int[] maxa = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            maxa[i]=count;
        }
        int temp = -1;
        int maxindex = -1;
        for(int i =0;i<maxa.length;i++){
            if(maxa[i]>temp){
                temp = maxa[i];
                maxindex = i;
            }
        }
        if(temp == 0){
            return -1;
        }else{
            return maxindex;
        }
    }
}