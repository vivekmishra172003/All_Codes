import java.util.*;

public class Check {
    public static void main(String[] args) {
        int n = 7789;
        Stack<Integer> stack = new Stack<>();

        // Push each digit of the number onto the stack
        while (n > 0) {
            int lastDigit = n % 10;
            stack.push(lastDigit);
            n = n / 10;
        }

        // Print each element in the stack (this will print digits in reverse order)
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // Print without new line
        }
    }
}
