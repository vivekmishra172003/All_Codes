import java.util.*;
public class Check{
    public static void main(String[] args){
        System.out.println("Check");
        int[] numbers = {2,4,6,8,10};
        int n = numbers.length;
        // int k =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")"+" ");
            }
            System.out.println("");
        }
    }
}

if there is n element then the total no of pairs will be 
= n(n-1) divived by 2