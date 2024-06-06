import java.util.*;
public class Check{
    public static int binarySearch(int numbers[],int key){
        int start =0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("Check");
        int numbers[] = {2,4,6,8,12,14};
        int key = 12;
        System.out.println(binarySearch(numbers,key));
    }
}

// Time Complexity: 
// :
// O(logn)
// Space Complexity: 
// :
// O(1)