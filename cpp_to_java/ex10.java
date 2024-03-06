package cpp_to_java;
import java.util.Scanner;

public class ex10 {
	public static void main (String[]args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter Beginning Balance of the month: ");
			double beginningBalance = sc.nextDouble();
			System.out.print("Enter Total withdrawls of the month: ");
			double totalWithdrawls = sc.nextDouble();
			System.out.print("Enter Total Deposit of the month: " );
			double totalDeposit = sc.nextDouble();
			
			double newBalance1 = beginningBalance - totalWithdrawls;
			double newBalance2 = newBalance1 + totalDeposit;
			double totalTranscation = totalWithdrawls + totalDeposit;
			double federalTax = totalTranscation * 0.01;
			double finalBalance = newBalance2 - federalTax;
			
			System.out.println("Transcation charges is " + federalTax);
			System.out.println("Final end of month balance is "+ finalBalance);
				
			if ( newBalance2 < totalWithdrawls )
				System.out.println("Not Enough Balance ");
			else
				System.out.println("Thank You");
		}
	}

}
