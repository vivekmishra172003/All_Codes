import java.util.*;
public class Check{
    public static void find(int data,int[] arr){
        int largestNumber = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(largestNumber<arr[i]){
                largestNumber=arr[i];
            }
        }
        System.out.println(largestNumber);
    }
    public static void main(String[] args){
        System.out.println("Check");
        int numbers[] = {1,2,6,3,5};

        find(5,numbers);
        // for(int i )
    }
}
// minusinfity = Integer.min_value
// plusinfity = Integer.max_value

// Time Complexity: O(n)
// Space Complexity: O(1)
