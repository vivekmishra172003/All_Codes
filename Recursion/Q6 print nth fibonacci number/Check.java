import java.util.*;
public class Check{
    public static int fibo(int n){
        if(n==0 || n ==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        int n = 26;
        int k = fibo(n);
        System.out.println(k);
    }
}