import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
    //Fill the code here
	System.out.print("Enter the size of first array\n");
	int n1 = sc.nextInt();
	if(n1<=0) {
		System.out.print(n1+" is an invalid array size");
		return;
	}
	System.out.print("Enter the array elements\n");
    ArrayList<Integer> arr1 = new ArrayList<>();
    for(int i =0;i<n1;i++) {
    	int k = sc.nextInt();
    	if(k<0) {
    		System.out.print(k+" is an invalid input");
    		return;
    	}
    	arr1.add(k);
    }
    
	System.out.print("Enter the size of second array\n");
	int n2 = sc.nextInt();
	if(n2<=0) {
		System.out.print(n2+" is an invalid array size");
		return;
	}
	if(n1 != n2) {
		System.out.print("Both array size is different");
		return;
	}
	System.out.print("Enter the array elements\n");
    ArrayList<Integer> arr2 = new ArrayList<>();
    for(int i =0;i<n2;i++) {
    	int k = sc.nextInt();
    	if(k<0) {
    		System.out.print(k+" is an invalid input");
    		return;
    	}
    	arr2.add(k);
    }
    
    
    ArrayList<Integer> arr3 = new ArrayList<>();
    
    for(int i =0;i<n1;i++) {
    	int k = arr1.get(i)+arr2.get(i);
    	arr3.add(k);
    }
    int sum=0;
    int ld;
    for(int i =0;i<n1;i++) {
    	ld = arr3.get(i)%10;
    	sum = sum+ld;
    }
    int count=0;
    for(int i =1;i<Math.sqrt(sum);i++) {
    	if(sum%i==0) {
    		count++;
    		if(sum/i!=i) {
    			count++;
    		}
    	}
    }
    if(count==2) {
    	System.out.print(sum+" is a prime number");
    }else {
    	System.out.print(sum+" is not a prime number");
    }
    
	}


}