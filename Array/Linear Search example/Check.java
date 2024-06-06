import java.util.*;
public class Check {
    public static void main(String[] args) {
        System.out.println("check");
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        boolean found = false;  /
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("it is present");
                found = true;  
                break;  
            }
        }
        
        if (!found) {  
            System.out.println("it is not present");
        }
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)