import java.util.*;
public class Check{
    public static void main(String[] args){
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i =0;i<fruits.length;i++){
            // Changed to 'compareToIgnoreCase' for case-insensitive comparison
            // if (largest.compareToIgnoreCase(fruits[i]) < 0) {
            if(largest.compareTo(fruits[i])<0){
                largest= fruits[i];
            }
        }
        System.out.println(largest);

    } 
}

// s1.campareTo(s2)  case sensiteve
//campareToIgonrecase  case insensitve
// 0:equal
// <0:s2 is greater
// >0:s1is greater