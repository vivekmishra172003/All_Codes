import java.util.*;
public class Check{
    public static void printr(int n){
        if(n == 0){
            return;
        }
        printr(n-1);
        System.out.print(n+" ");
    }
public static void main(String[] args){
    System.out.println("check");
    int n =5;
    printr(n);
    }
}