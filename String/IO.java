import java.util.*;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // Read the first token
        sc.nextLine(); // Consume the newline character left by sc.next()
        String fullname = sc.nextLine(); // Read the full line
        System.out.println(name);
        System.out.println(fullname);
    }
}
