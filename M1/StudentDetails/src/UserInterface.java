import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student's Id:\n");
		int id = sc.nextInt();
		System.out.print("Enter Student's Name:\n");
		String name = sc.next();
		System.out.print("Enter Student's address:\n");
		String address = sc.next();
		System.out.print("Whether the student is from NIT(Yes/No):\n");
		String yn = sc.next();
		yn = yn.toLowerCase();
		while(!(yn.equals("yes")||  yn.equals("no"))) {
			System.out.print("Wrong Input\n");
			System.out.print("Whether the student is from NIT(Yes/No):\n");
			yn = sc.next();
		}
		if(yn.equals("yes")) {
			Student s1 = new Student(id,name,address);
			System.out.println("Student id:"+s1.getStudentId());
			System.out.println("Student name:"+s1.getStudentName());
			System.out.println("Address:"+s1.getStudentAddress());
			System.out.println("College name:"+s1.getCollegeName());
		}else {
			System.out.print("Enter the college name:\n");
			String clg = sc.next();
			Student s2 = new Student(id,name,address,clg);
			System.out.println("Student id:"+s2.getStudentId());
			System.out.println("Student name:"+s2.getStudentName());
			System.out.println("Address:"+s2.getStudentAddress());
			System.out.println("College name:"+s2.getCollegeName());
		}
		
    }
}

