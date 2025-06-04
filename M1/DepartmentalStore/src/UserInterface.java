import java.util.Scanner;

public class UserInterface {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Fill the code
		System.out.print("Enter the customer name\n");
		String cname = sc.nextLine();
		System.out.print("Enter the phone number\n");
		String pnum = sc.nextLine();
		System.out.print("Enter the street name\n");
		String sname = sc.nextLine();
		System.out.print("Enter the bill amount\n");
		double bill = sc.nextDouble();
		System.out.print("Enter the distance\n");
		int dis = sc.nextInt();
		CustomerDetails cd = new CustomerDetails(cname,pnum,sname,bill,dis);
		System.out.println("Customer name: "+cd.getCustomerName());
		System.out.println("Phone number: "+cd.getPhoneNumber());
		System.out.println("Street name: "+cd.getStreetName());
		System.out.println("Bonus points: "+cd.calculateBonusPoints());
		System.out.println("Delivery charge: "+cd.deliveryCharge());
		
		
	}
}
