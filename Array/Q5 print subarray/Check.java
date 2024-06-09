import java.util.*;
public class Check{
    public static void main(String[] args){
        System.out.println("Check");
        int[] numbers = {2,4,6,8,10};
        printSubA(numbers);
    }
    public static void printSubA(int[] numbers){
        for(int i =0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                System.out.print(" ("+" ");
                for(int k =i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.print(" )"+" ");
            }
            System.out.println("");
        }
    }
}