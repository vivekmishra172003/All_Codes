import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.print("Enter the training id\n");
		long trainingId = sc.nextInt();
		String ti = Long.toString(trainingId);
		if(ti.length()!=9) {
			System.out.print(ti+" is an invalid training id");
			return;
		}
		if(!((ti.substring(0, 4)).equals("2021"))) {
			System.out.print(ti.substring(0, 4)+" is an invalid year");
			return;
		}
		String fs = ti.substring(4, 6);
		String temp;
		switch(fs) {
		case "01":
			temp = "LP";
			break;
		case "02":
			temp = "TA";
			break;
		case "03":
			temp = "CT";
			break;
		case "04":
			temp = "PT";
			break;
		case "05":
			temp = "TT";
			break;
		default:
			System.out.print(fs+" is an invalid team code");
			return;
		}
		int tempnum = Integer.parseInt(ti.substring(6, 9));
		if(!(tempnum >= 1 && tempnum <= 999)) {
			System.out.print(ti.substring(6, 9)+" is an invalid roll number");
			return;
		}
		
		System.out.print("Employee Id: SIET"+temp+ti.substring(6, 9));
		
		
	}
	
}	
