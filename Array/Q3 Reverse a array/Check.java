import java.util.*;
public class Check{
    public static void reverse(int[] numbers){
        int n = numbers.length;
        for(int i =0;i<n/2;i++){
            swap(i,n-1-i,numbers);
        }
    }
        public static void swap(int i,int j,int[] numbers){
            int temp = numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10};
        reverse(numbers);
        for(int i =0;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }
    }
}