import java.util.*;
public class Check{
    public static void main(String[] args){
        System.out.println("check the fuck");
        StringBuilder s = new StringBuilder("aaabbcccdd");
        System.out.println(compress(s));


    }
    public static StringBuilder compress(StringBuilder s){
        StringBuilder ns = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            Integer count =1;
            while(i<s.length()-1 && s.charAt(i)== s.charAt(i+1)){
                count++;
                i++;
            }
            ns.append(s.charAt(i)); 
            if(count>1){
                ns.append(count);
            }
        }
        return ns;
    }

}