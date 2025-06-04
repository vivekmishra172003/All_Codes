import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the date of joining\n");
        String sd = sc.nextLine();
        String[] sda = sd.split("/");
        int date = Integer.parseInt(sda[0]);
        int month = Integer.parseInt(sda[1]);
        int year = Integer.parseInt(sda[2]);
        

        
        LocalDate joiningDate = LocalDate.of(year, month, date);
        LocalDate currentDate = LocalDate.of(2020, 12, 15);
        
        Period experience = Period.between(joiningDate, currentDate);
        System.out.println(experience.getYears() + " years of experience");
    }
}