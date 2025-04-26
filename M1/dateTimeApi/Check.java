import java.util.*;
public class Check{
    public static void main(String[] args){
        System.out.println("ram ram");
        Date dateobj1 = new Date();
        long millisec = System.currentTimeMillis();
        Date dateObj2 = new Date(millisec);
        System.out.println(dateobj1);
        System.out.println(dateObj2);
    }
}