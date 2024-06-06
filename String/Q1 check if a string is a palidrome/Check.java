import java.util.*;
public class Check{
    public static void main(String[] args){
        System.out.println("Check");
        Scanner sc = new Scanner(System.in);
        String palin = sc.next();
        checkPalin(palin);
    }
    public static void checkPalin(String palin){
        int n = palin.length();
        for(int i =0;i<n/2;i++){
            if(!(palin.charAt(i) ==palin.charAt(n-1-i))){
                System.out.println("not a palindrome");
                break;
            }
        }
        System.out.println("a plaindrom");
    }
}
https://leetcode.com/problems/valid-palindrome/description/ 
