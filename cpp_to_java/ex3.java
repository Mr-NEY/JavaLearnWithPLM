package cpp_to_java;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Purchase Amount: ");
			double purchAmount = sc.nextDouble();
			System.out.print("Enter tax code: ");
			int taxCode = sc.nextInt();
			double saleTax=0;
			switch (taxCode) {
			case 0 : saleTax = 0; break;
			case 1 : saleTax = purchAmount * 0.03;break;
			case 2 : saleTax = purchAmount * 0.05;break;
			case 3 : saleTax = purchAmount * 0.07;break;
					
			}
			System.out.println("Sale Tax is "+ saleTax);
			double totalAmount = saleTax + purchAmount;
			System.out.println("Total Amount is "+ totalAmount);
			
		}
				
}
}