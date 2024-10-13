import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Read input from STDIN
        Scanner sc = new Scanner(System.in);
        
        // Read n and k
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Read the string
        String s = sc.next();
        
        // Find the kth character in the reversed string
        // Since indexing is 0-based, we print s.charAt(n - k)
        System.out.println(s.charAt(n - k));
    }
}
