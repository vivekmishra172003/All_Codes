import java.util.*;
public class Check{
    public static int sumOfN(int n){
        if(n == 0 ){
            return 0;
        }
        return n+sumOfN(n-1);
    }
    public static void main(String[] args){
        int n =3;
        int sum = sumOfN(n);
        System.out.println(sum);
    }
}
// base case 
// work
// reccrion call