import java.util.*;
public class Check{
    public static void main(String[] args){
        int num[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<num.length;i++){
            map.put(num[i],map.getOrDefault(num[i],0)+1);
        }
        //print
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
        for(Integer key :map.keySet()){
            if(map.get(key)>num.length/3){
                System.out.println(key);
            }
        }
    }
}