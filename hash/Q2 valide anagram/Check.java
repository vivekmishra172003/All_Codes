import java.util.*;
public class Check{
    public static void main(String[] args){
        String s = "race";
        String t = "care";
        TreeMap<Character,Integer> map1 = new TreeMap<>();
        TreeMap<Character,Integer> map2 = new TreeMap<>();
        for(int i =0;i<s.length();i++){
            char k = s.charAt(i);
            map1.put(k,map1.getOrDefault(k,0)+1);
        }
        for(int i =0;i<t.length();i++){
            char k = t.charAt(i);
            map2.put(k,map2.getOrDefault(k,0)+1);
        }
        System.out.println(map1.equals(map2));
    }
}