import java.util.*;
public class UserInterface{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//FILL CODE HERE
		System.out.print("Enter the word\n");
		String st = sc.nextLine();
		System.out.print("Enter the two indices\n");
		int n = st.length();
		int a = sc.nextInt();
		if(a>=n) {
			System.out.print(a+" is greater than the word length");
			return;
		}
		int b = sc.nextInt();
		if(b>=n) {
			System.out.print(b+" is greater than the word length");
			return;
		}
		if(a>=b) {
			System.out.print("Index2 should be greater than Index1");
			return;
		}

		
		String ns = st.substring(a, b);
		System.out.print(ns);
		
	}
}
