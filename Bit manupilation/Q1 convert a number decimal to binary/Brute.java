import java.util.*;
public class Brute{
    public static void main(String[] args){
        System.out.println("Check it");
        int n = 10;
        int[] bitA = new int[32];
        int i =0;
        while(n>0){
            bitA[i]=n%2;
            n = n/2;
            i++;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(bitA[j]);
        }
    }
}