import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    		// Fill the code
		System.out.print("Enter Student Id\n");
		int sid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Student name\n");
		String sname = sc.nextLine();
		System.out.print("Enter Department name\n");
		String dname = sc.nextLine();
		System.out.print("Enter gender\n");
		String gen = sc.nextLine();
		System.out.print("Enter category\n");
		String cat = sc.nextLine();
		if(cat.equals("Hosteller")) {
			System.out.print("Enter College fee\n");
			double cfee = sc.nextDouble();	
			System.out.print("Enter the room number\n");
			int rnum = sc.nextInt();
			System.out.print("Enter the Block name\n");
			char bt = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Enter the room type\n");
			String rt = sc.nextLine();
			Hosteller hs = new Hosteller(sid,sname,dname,gen,cat,cfee,rnum,bt,rt);
			System.out.print("Total College fee is "+hs.calculateTotalFee());
		}
		if(cat.equals("DayScholar")) {
			System.out.print("Enter College fee\n");
			double cfee = sc.nextDouble();	
			System.out.print("Enter Bus number\n");
			int bn = sc.nextInt();
			System.out.print("Enter the distance\n");
			int dis = sc.nextInt();
			DayScholar hs = new DayScholar(sid,sname,dname,gen,cat,cfee,bn,dis);
			System.out.print("Total College fee is "+hs.calculateTotalFee());
		}
		
		
		

	}

}
