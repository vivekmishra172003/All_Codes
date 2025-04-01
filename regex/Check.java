import java.util.*;

public class Check {
    public static void main(String[] args) {
        System.out.println("Checkit");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String pan = sc.nextLine();

        boolean b = pan.matches("\d{5}");
        if(b) {
            System.out.println("this is working");
        }
    }
}