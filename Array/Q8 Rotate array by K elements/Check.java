import java.util.*;
public class Check{
public static  void main(String[] args){
    System.out.println("Check it");
    int n =7; int[] array = {1,2,3,4,5,6,7}; int k =2;
    for(int i =0;i<k;i++){
         int last = array[n - 1];

            // Shift all elements to the right by one position
            for (int j = n - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            // Place the last element at the first position
            array[0] = last;
    }
     System.out.println(Arrays.toString(array));
    }
}

// n*n