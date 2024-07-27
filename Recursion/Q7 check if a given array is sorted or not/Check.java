import java.util.*;
public class Check{
    public static boolean iSorted(int i ,int num[]){
        if(i == num.length-1){
            return true;
        }
        if(num[i]<num[i+1]){
            return iSorted(i+1,num);
        }
        return false;
    }
    public static void main(String[] args){
        int[] num = {1,2,3,4,1};
        boolean k = true;
        if(num.length != 0){
        k = iSorted(0, num);
        }
        System.out.println(k);

    }
}