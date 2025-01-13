// Remove All White Spaces and Return the Length of the Resulting String
import java.util.*;
public class Check{
public static void  main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String st = "  Hello   World  ";
    System.out.println((st.replaceAll("\\s+","")).length());

}
}