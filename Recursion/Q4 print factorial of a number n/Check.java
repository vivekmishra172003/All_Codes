import java.util.*;
public class Check{
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        System.out.println("Check shit");
        int n = 5;
        int k = fact(n);
        System.out.println(k);
    }
}