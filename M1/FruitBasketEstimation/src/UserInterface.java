import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		//Fill the code here
		Scanner sc = new Scanner(System.in);
		FruitBasketUtility fu = new FruitBasketUtility();
		List<FruitBasket> fbl = new ArrayList<FruitBasket>();
		while(true) {
			System.out.println("Select an option:");
			System.out.println("1.Add Fruit to Basket");
			System.out.println("2.Calculate Bill");
			System.out.println("3.Exit");
			int option = sc.nextInt();
			sc.nextLine();
			if(option != 1 && option != 2 && option != 3) {
				System.out.println("Invalid option. Please try again.");
				return;
			}
			if(option == 1) {
				System.out.println("Enter the fruit name");
				String fruitName = sc.nextLine();
				System.out.println("Enter weight in Kgs");
				int wkg = sc.nextInt();
				System.out.println("Enter price per Kg");
				int pkg = sc.nextInt();
				fu.addToBasket(new FruitBasket(fruitName,wkg,pkg));
			}
			
			if(option == 2) {
				if(fu.getFruitBasketList().isEmpty()) {
					System.out.println("Your basket is empty. Please add fruits.");
				}else {
					
				
				int price = fu.calculateBill(fu.getFruitBasketList().stream());
				System.out.println("The estimated bill amount is Rs "+price);
				}
			}
			if(option==3) {
				System.out.println("Thank you for using the application.");
				break;
			}
			
		}
	}

}
