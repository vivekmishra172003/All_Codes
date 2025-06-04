import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       // Fill the code
       UserInterface ui = new UserInterface();
       System.out.print("Enter the String\n");
       String str = sc.nextLine();
       System.out.print("Enter First Index\n");
       int fi = sc.nextInt();
       System.out.print("Enter Second Index\n");
       int si = sc.nextInt();
       System.out.print(ui.extractString(str, fi, si)+"Thanks for using the application.");
       
       
    }
	
	public String extractString(String str,int fi,int si)
    {
        // Fill the code
		try {
			int n = str.length();
			if(si<0||si>=n) {
				throw new StringIndexOutOfBoundsException();
			}
			return "The output string is "+str.substring(fi, si)+". ";
			
			
			
		}catch(StringIndexOutOfBoundsException e) {
			return "Invalid index position. ";
		}
    }

}
