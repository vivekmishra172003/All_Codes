import java.util.*;
// BackTracking is all about choices 
public class Classroom{
    public static void findSubsets(String str,String ans,int i){
        // base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursion
        //Yes
        findSubsets(str, ans+str.charAt(i), i+1);
        //No
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
    String str = "abc";
    findSubsets(str, "", 0);
    
}
}