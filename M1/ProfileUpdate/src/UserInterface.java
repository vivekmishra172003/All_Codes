import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.print("Enter your name\n");
		String name = sc.nextLine();
		System.out.print("Enter your PAN number\n");
		String pan = sc.nextLine();
//		if(pan.length()!=10) {
//			
//		}
		if(!(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))) {
			System.out.print(pan+" is an invalid PAN number");
			return;
		};
		System.out.print("Enter your E-mail ID\n");
		String email=sc.nextLine();
		if(!(email.matches("[a-z]{5,10}@digitec.com"))){
			System.out.print("Invalid E-mail ID");
			return;	
		}
		System.out.print("Profile of "+name+" updated successfully");
	}
}