import java.util.Scanner;
public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code	
		System.out.print("Enter the name\n");
		String name = sc.next();
		System.out.print("Enter the age\n");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the gender\n");
		String gender = sc.nextLine();
		System.out.print("Enter the blood group\n");
		String bloodGroup = sc.nextLine();
		System.out.print("Enter the phone no\n");
		long phoneNumber = sc.nextLong();
		
		DonorDetails dd = new DonorDetails(name,age,gender,bloodGroup,phoneNumber);
		System.out.println("Name:"+dd.getName());
		System.out.println("Age:"+dd.getAge());

		System.out.println("Gender:"+dd.getGender());
		System.out.println("Blood group:"+dd.getBloodGroup());
		System.out.println("Phone no:"+dd.getPhoneNumber());


	}

}
