import java.util.Scanner;
public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Student's Id: ");
		String studentid=input.nextLine();
		
		System.out.println("Enter the Student’s full name: ");
		String studentname=input.nextLine();
		
		
		System.out.println("Enter crn/credit hours for the first class(like 5665/3:");
		String firstcredit=input.nextLine();
		
		System.out.println("Enter crn/credit hours for the second class(like 5665/3): ");
		String secondcredit=input.nextLine();
		
		System.out.println("Thank you!");
		System.out.println("Fee invoice prepared for:" + studentname);
		
		System.out.println("\n\t\tSimple College");
		System.out.println("\t\tOrlando Fl 10101");
		System.out.println("\t\t*************************");
		
		String data = firstcredit;
		String [] array;
		String str1 , str2;
		int number;
		array = data.split("/");
		str1 = array[0];
		str2 = array[1];
		number=Integer.parseInt(str2);
		
		
		String data2 = secondcredit;
		String [] array2;
		String str3 , str4;
		int number2;
		array2 = data2.split("/");
		str3 = array2[0];
		str4 = array2[1];
		number2=Integer.parseInt(str4);
		
		
		System.out.println("\n\t\tFee Invoice Prepared for:");
		System.out.println("\t\t[" + studentname +"][" + studentid +"]");
		
		double credithourcost = 120.25d;
		double coursecost= number*credithourcost;
		double coursecost2= number2*credithourcost;
		double healthfee= 35.00d;
		
		System.out.println("\n\t\t 1 Credit hour =$" + credithourcost);
		
		System.out.println("\n\t\t CRN\tCredit Hours\t");
		System.out.printf("\n\t\t%s\t%d          \t\t$%.2f",str1,number,coursecost);
		System.out.printf("\n\t\t%s\t%d           \t\t$%.2f",str3,number2,coursecost2);
		System.out.printf("\n\t\t\tHealth & id fees\t$%.2f",healthfee);
		
		System.out.println("\n\t\t------------------------------------------------");
		System.out.printf("\n\t\tTotal Payments     \t\t $%.2f",(coursecost+coursecost2+healthfee));

	
	}

}
