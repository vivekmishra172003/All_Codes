import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<n;i++){
            String s = sc.nextLine();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int k = sc.nextInt();
        List<String> slist = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                slist.add(entry.getKey());
            }
        }

        if(slist.size()<k){
            System.out.println("-1");
        }else{
            System.out.println(slist.get(k-1));
        }
    }
}