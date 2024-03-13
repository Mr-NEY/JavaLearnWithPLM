package polymorphism;

import java.util.Scanner;

public class Module25 {
	static int addition(int num1 ,int num2) {
		return num1+num2;
	}
	static double addition(double dnum1 , double dnum2) {
		return dnum1+dnum2;
	}
	static void addition() {
		int sum = 0;
		String status= "yes";
		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.print("Enter Number : ");
				sum += input.nextInt();
				System.out.println("Do you want to input next Number(yes/no)");
				status = input.next();		
			}while(status.equals("yes"));
		}
		System.out.print("Sum = "+sum);
		
	}
	public static void main(String[]args) {
		System.out.println("Num1 + Num2 = "+addition(23,24));
		System.out.println("Dnum1 + Dnum2 = "+ addition(24,25));
		addition();
	}
	
}
