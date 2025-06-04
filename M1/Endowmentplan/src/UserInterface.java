import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.print("Enter Endowment Id\n");
		String eid = sc.nextLine();
		System.out.print("Enter Holder Name\n");
		String holname = sc.nextLine();
		System.out.print("Enter Endowment Type\n");
		String etype = sc.nextLine();
		if(etype.equalsIgnoreCase("health")) {
			System.out.print("Enter Registration Date\n");
			String date = sc.nextLine();
			System.out.print("Enter Health Care Center\n");
			String halcen = sc.nextLine();
			System.out.print("Enter Holder Age\n");
			int halage = sc.nextInt();
//String endowmentId, String holderName, String endowmentType, String registrationDate ,String healthCareCenter, int holderAge
			 HealthEndowment ho = new  HealthEndowment(eid,holname,etype,date,halcen,halage);
			 
			 System.out.printf("Endowment Amount %.2f",ho.calculateEndowment());
			 return;
			
			
		}
		else if(etype.equalsIgnoreCase("Educational")) {
			System.out.print("Enter Registration Date\n");
			String date = sc.nextLine();
			System.out.print("Enter Educational Institution\n");
			String edi = sc.nextLine();
			System.out.print("Enter Educational Division\n");
			String ed = sc.nextLine();
//String endowmentId, String holderName, String endowmentType, String registrationDate ,String educationalInstitution,String educationalDivision
			EducationalEndowment ee = new EducationalEndowment(eid,holname,etype,date,edi,ed);
			 System.out.printf("Endowment Amount %.2f",ee.calculateEndowment());
			 return;
			
			
		}
		else {
			System.out.print(etype+" is an invalid endowment type");
			return;
		}
	}

}
