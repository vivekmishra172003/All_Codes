import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        String sdate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // This ensures strict parsing

        try {
            sdf.parse(sdate);
            System.out.println(sdate + " is a valid date");
        } catch (ParseException e) {
            System.out.println(sdate + " is not a valid date");
        }
    }
}