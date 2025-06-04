import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		// Fill the code here
		System.out.print("Enter the products count\n");
		int pc = sc.nextInt();
		if(pc<=0) {
			System.out.print("Invalid count");
			return;
		}
		sc.nextLine();
		System.out.print("Enter Product details\n");
		 List<Product> pal = new ArrayList<>();
		for(int i =0;i<pc;i++) {
			String st = sc.nextLine();
			String[] arr = st.split(":");
			int pi = Integer.parseInt(arr[0]);
			String inp = arr[1];
			double pri= Double.parseDouble(arr[2]);
			pal.add(new Product(pi,inp,pri));
		}
		
		System.out.print("1.Sort By Id\n2.Sort By Price\nEnter your choice\n");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice!=2 && choice !=1) {
			System.out.print("Invalid choice");
			return;
		}
		
		if(choice==1) {
			System.out.print("After Sorting By Id\n");
			Collections.sort(pal,new SortById());
		}
		if(choice==2) {
			System.out.print("After Sorting By Price\n");
			Collections.sort(pal,new SortByPrice());
		}
		
		for(Product p:pal) {
			System.out.println(p);
		}
		
		
		
	}

}
