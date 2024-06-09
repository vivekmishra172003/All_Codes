import java.util.*;
public class Check{
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("hi, i am shradha");
        String s = s1.toString().toUpperCase().replaceAll("[^A-Z]","");
        System.out.println(s);
    }
}