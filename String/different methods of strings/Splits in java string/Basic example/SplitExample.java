import java.util.*;
public class SplitExample{
    public static void main(String[] args){
        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}