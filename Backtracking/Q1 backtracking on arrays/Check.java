import java.util.*;

public class Check{
    public static void  changeArr(int arr[],int i,int val){
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i] -=2;
    }
    public static void main(String[] args){
        System.out.print("check the shit");
        int arr[] = new int[5];
        changeArr(arr,0,1);
        System.out.print(Arrays.toString(arr));
    
    }
}