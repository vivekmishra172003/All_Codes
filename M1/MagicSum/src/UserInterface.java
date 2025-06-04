import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       int[] parr = {2, 3, 5, 7, 11, 13, 17, 19, 23};
       System.out.print("Enter the array size\n");
       int n = sc.nextInt();
       if(n<1 || n>5) {
    	   System.out.print(n+" is an invalid array size");
    	   return;
       }
       ArrayList<Integer> al = new ArrayList<>();
       System.out.print("Enter the numbers\n");
       for(int i =0;i<n;i++) {
    	   int k = sc.nextInt();
    	   if(k>=100 || k<=0) {
        	   System.out.print(k+" is an invalid input");
        	   return;
           }
    	   al.add(k);
       }
       
       ArrayList<Integer> fl = new ArrayList<>();
       

       int prime =0;
       for(int i =0;i<n;i++) {
    	   
    	   int num = al.get(i);
    	   if(isPrime(num)) {
    		   int psum=0;
    		   for(int j =0;j<parr.length;j++) {
    			   psum = psum+parr[j];
    			   if(psum==num) {
//    				   
    				   prime++;
    				   fl.add(num);
    				   break;
    			   }
    			   if(psum>num) {
    				   break;
    			   }
    		   }
    		   
    	   }
       }
       
       
       
       if(prime==0) {
    	   System.out.print("The "+n+" numbers are not sum of prime numbers");
    	   return;
       }else {
           System.out.print("The sum of prime numbers is\n");
           for(int i =0;i<fl.size();i++) {
        	   System.out.println(fl.get(i));
           }
       }
       
        
    }
    public static boolean isPrime(int num) {
    	int count=0;
    	for(int i =1;i<Math.sqrt(num);i++) {
    		if(num%i==0) {
    			count++;
    			if(num/i!=i) {
    				count++;
    			}
    		}
    	}
    	if(count==2) {
    		return true;
    	}
    	return false;
    }
}