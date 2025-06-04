import java.util.*;
public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Customer Name");
        String name = sc.nextLine();
        
        System.out.println("Enter Phone Number");
        long pnum = sc.nextLong();
        sc.nextLine();
        
        System.out.println("Enter address");
        String ads = sc.nextLine();
        
        CustomerDetails customer = new CustomerDetails(name, pnum, ads);
        
        System.out.println("Enter Bero Type");
        String bt = sc.nextLine();
        
        Discount discount = new Discount();
        
        if(bt.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String bc = sc.nextLine();
            System.out.println("Enter Wood Type");
            String wt = sc.nextLine();
            
            WoodenBero obj = new WoodenBero(bt, bc, wt);
            obj.calculatePrice();
            double discountAmount = discount.calculateDiscount(obj);
            double totalPrice = obj.getPrice() - discountAmount;
            System.out.printf("Amount needs to be paid %.2f\n", totalPrice);
        }
        else if(bt.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String bc = sc.nextLine();
            System.out.println("Enter Bero Height");
            int height = sc.nextInt();
            
            SteelBero obj = new SteelBero(bt, bc, height);
            obj.calculatePrice();
            double discountAmount = discount.calculateDiscount(obj);
            double totalPrice = obj.getPrice() - discountAmount;
            System.out.printf("Amount needs to be paid %.2f\n", totalPrice);
        }
        else {
            System.out.println(bt + " is an invalid bero type");
        }
    }
}