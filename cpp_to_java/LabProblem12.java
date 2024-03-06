package cpp_to_java;

import java.util.Scanner;

public class LabProblem12 {

	public static void main(String[] args) {
		int code;
		double price,newPrice,disAmount=0;
		try(Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter Price : ");
		price = sc.nextDouble();
		System.out.print("Enter Code : ");
		code = sc.nextInt();
		switch (code) {
		case 1 :disAmount = 0;break;
		case 2 :disAmount = price * 0.2;break;
		case 3 :disAmount = price * 0.3;break;
		case 4 :disAmount = price * 0.4;
		default : System.out.println("Code Error");
		}
		newPrice = price - disAmount;
		System.out.println("\nOriginal Price = "+ price);
		if(code == 1)
			System.out.println("Discount Amount = No Discount");
			else if (code==2||code==3||code==3||code==4)
				System.out.println("Discount Amount = "+disAmount);
		System.out.println("Doscounted Price = "+newPrice);
			
				
		
		
		}
	}

}
