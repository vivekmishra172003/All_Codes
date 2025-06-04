import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice");
		System.out.println("1.Find Volume For Cylinder");
		System.out.println("2.Find Volume For Cuboid");
		VolumeCalculator val = new VolumeCalculator();
		int n = sc.nextInt();
		if(n==1) {
			System.out.print("Enter the radius\n");
			double radius = sc.nextDouble();
			System.out.print("Enter the height\n");
			double height = sc.nextDouble();
			System.out.printf("Volume of the Cylinder is %.2f",val.calculateVolume(radius, height));
		}else {
			System.out.print("Enter the  length\n");
			int  length = sc.nextInt();
			System.out.print("Enter the breadth\n");
			int breadth = sc.nextInt();
			System.out.print("Enter the height\n");
			int height = sc.nextInt();
			System.out.printf("Volume of the Cuboid is %.2f",val.calculateVolume(length, breadth, height));
		}
		
		
    }
}

