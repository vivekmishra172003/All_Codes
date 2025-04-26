import java.util.*;
public class Check1{
    public static void main(String[] args){
        System.out.println("Check");
        Date d1 = new Date(2019,12,31);
        Date d2 = new Date(2019,10,25);
        System.out.println(d1.after(d2));
        System.out.println(d2.before(d2));
        System.out.println(d2.compareTo(d2));
        System.out.println(d1.getTime());
        Date d3 = new Date(d1.getTime());
        System.out.println(d3.toString());

        Date d4 = new Date();
        System.out.println("Befor DAte"+d4);
        d4.setTime(3600*1000);
        System.out.println("Afeter time"+d4);
    }
}