import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxV =0;
        int sum=0;
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            sum = sum+arr[i];
            maxV = Math.max(sum,maxV);
        }
        System.out.println(maxV);
        
    }
}