import java.util.*;
public class Check{
    public static char[] stringToChar(String s){
        char[] rt = new char[s.length()];
        for(int i =0;i<s.length();i++){
            rt[i]=s.charAt(i);
        }
        return rt;
    }
    public static void main(String[] args){
        System.out.println("Check");
        String s = "Vivek";
        char[] rt = stringToChar(s);
        for(int i =0;i<rt.length;i++){
            System.out.print(rt[i]+" ");
        }
    }
}