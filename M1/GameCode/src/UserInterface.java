import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.print("Enter your profile code\n");
		String pc = sc.nextLine();
		if(pc.charAt(0) !='#') {
			System.out.print(pc+" does not start with a valid special character");
			return;
		}
		if(pc.length()!=8) {
			System.out.print(pc+" does not have the specified length");
			return;
		}
		
		int num=0;
		for(int i=1;i<5;i++) {
			char ch = pc.charAt(i);
			if(Character.isUpperCase(ch)) {
				num++;
			}
		}
		if(num!=4) {
			System.out.print(num+" is an invalid number for uppercase character");
			return;	
		}
		num=0;
		StringBuilder sb = new StringBuilder();
		for(int i =5;i<8;i++) {
			char ch = pc.charAt(i);
			if(Character.isDigit(ch)) {
				sb.append(ch);
				num++;
			}
		}
		
		if(num!=3) {
			System.out.print(num+" is an invalid number for digits");
			return;	
		}
		System.out.print(pc+" is a valid profile code whose last 3 digits are "+sb);
		
	}
}


//there are two arrays accept value form user for first array and thecn thck if 

