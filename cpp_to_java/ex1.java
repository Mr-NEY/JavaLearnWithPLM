package cpp_to_java;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the tax rate (as a petcent): ");
			double taxRate = sc.nextDouble();
			
			System.out.print("Enter the price of item 1: ");
			double item1 = sc.nextDouble();
			System.out.print("Enter the price of item 2: ");
			double item2 = sc.nextDouble();
			System.out.print("Enter the price of item 3: ");
			double item3 = sc.nextDouble();
			
			double totalPrice = item1 + item2 + item3;
			double taxPayable = totalPrice * taxRate / 100;
			
			System.out.println("The total price before tax is: "+ totalPrice);
			System.out.println("The tax payable is: " + taxPayable);
		}
		
		
}
}