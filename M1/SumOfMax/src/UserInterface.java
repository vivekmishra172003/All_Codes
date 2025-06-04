import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.print("Enter the array size\n");
        int n = sc.nextInt();
        if(n<=0) {
        	 System.out.print(n+" is an invalid array size");
        	 return;
        }
        if(n%2!=0) {
        	 System.out.print(n+" is an odd number.Please enter even number");
        	 return;
        }
        System.out.print("Enter the number\n");
        ArrayList<Integer> arr = new  ArrayList<>();
        for(int i =0;i<n;i++) {
        	int k = sc.nextInt();
        	arr.add(k);
        }
        Collections.sort(arr);
        // int m = Integer.MIN_VALUE;
        // for(int i =0;i<n/2;i++) {
        // int	m = Math.max(m,(arr.get(n-1-i)+arr.get(i)));
        	int	m = arr.get(n-1)+arr.get(0);
        	
        // }
        System.out.print("The maximum number is "+m);
        
    }
}