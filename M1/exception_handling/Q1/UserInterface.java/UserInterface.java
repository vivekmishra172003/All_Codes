import java.util.*;
import java.io.*;

public class UserInterface {

    public static String getDuplicateElement() {
        try {
            // Fill the code
            Scanner sc = new Scanner(System.in);
            // size of array n
            int n = sc.nextInt();
            if(n<=0){
                throw new NegativeArraySizeException("Input was not in the correct format");
            }
            // array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // postion
            // print the array and print the postion
            int k = sc.nextInt();

            if (k >= n || k < 0) {
                throw new ArrayIndexOutOfBoundsException("Array index is out of range");
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append(arr[k]);
            return sb.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        } catch(NegativeArraySizeException e){
            return e.getMessage();
        }
        catch(InputMismatchException e){
            return e.getMessage();
        }

    }

    public static void main(String[] args) {
        // Fill the code
        System.out.print(getDuplicateElement());

    }
}