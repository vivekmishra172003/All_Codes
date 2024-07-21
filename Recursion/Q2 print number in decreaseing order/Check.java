import java.util.*;
public class Check{
    public static void rec(int n){
        if(n == 0 ){
            return;
        }
        System.out.println(n);
        rec(n-1);
    }
    public static void main(String[] args){
        System.out.println("Check");
        int n =10;
        rec(n);
    }
}