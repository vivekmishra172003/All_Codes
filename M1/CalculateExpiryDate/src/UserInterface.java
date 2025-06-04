import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Manufacturing Date");
        String manuDateStr = sc.nextLine().trim();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        
        try {
            Date manuDate = sdf.parse(manuDateStr);
            System.out.println("Enter the Month");
            int months = sc.nextInt();
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(manuDate);
            cal.add(Calendar.MONTH, months);
            
            Date expiryDate = cal.getTime();
            String expiryDateStr = sdf.format(expiryDate);
            System.out.println(expiryDateStr + " is the expiry date");
            
        } catch (ParseException e) {
            System.out.println(manuDateStr + " is not a valid date");
        }
    }
}