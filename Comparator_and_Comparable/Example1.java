// Comprator example
import java.util.*;
public class Example1{
    public static void main(String[] args){
        System.out.println("Check");
        //sort naturally
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(3);
        nums.add(7);
        nums.add(9);
        Collections.sort(nums);
        System.out.println(nums);
        //sorting based on lastdigit
        // for that we can use comprator

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                // if we retun 1 means swap
                // if we retun -1 means Noswap
                if(i%10>j%10){
                    return 1;
                }
                    else 
                    return -1;
                
            }
        };

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(43);
        nums1.add(31);
        nums1.add(72);
        nums1.add(29);
        Collections.sort(nums1,com);
        System.out.println(nums1);
    }
}