import java.util.Scanner;
public class UserInterface 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name\n");
        String name = sc.nextLine();
        System.out.print("Enter your ID\n");
        String eid = sc.nextLine();
        
        // Modified regex to properly handle single digit hours
        if(!(eid.matches("SPC[0-9]{3}(0[1-9]|1[0-2])[A|P]{1}M"))) {
            System.out.println(eid + " is an Invalid ID");
            return;
        }
        
        // If ID is valid, extract seat number and time
        String seatNumber = eid.substring(3, 6);
        String time = eid.substring(6, 8);
        String period = eid.substring(8, 10);
        
        // Print success message
        System.out.println("Hi " + name + " your seat number is " + 
            Integer.parseInt(seatNumber) + " and the event starts at " + 
            Integer.parseInt(time) + period);
    }
}