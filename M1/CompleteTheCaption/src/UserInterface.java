import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the first string\n");
       String s1 = sc.nextLine();
       System.out.print("Enter the second String\n");
       String s2 = sc.nextLine();
       int n1=s1.length();
       int n2 = s2.length();
       if(n1!=n2) {
    	   System.out.print("Length of the strings "+s1+" and "+s2+" does not match");
    	   return;
       }
       if(!(s1.matches("^[a-zA-Z! ]*$"))&&!(s2.matches("^[a-zA-Z! ]*$"))) {
    	   System.out.print(s1+" and "+s2+" contains invalid symbols");
    	   return;
       }
       
       if(!(s1.matches("^[a-zA-Z! ]*$"))) {
    	   System.out.print(s1+" contains invalid symbols");
    	   return;
       }
       if(!(s2.matches("^[a-zA-Z! ]*$"))) {
    	   System.out.print(s2+" contains invalid symbols");
    	   return;
       }
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < n1; i++) {
           char c1 = s1.charAt(i);
           if (c1 == '!') {
               result.append(s2.charAt(i));
           } else {
               result.append(c1);
           }
       }
       
       System.out.print(result.toString());
    }
}
