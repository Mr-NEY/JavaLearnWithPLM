package cpp_to_java;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter weight of the percel(in kg): ");
			double percelWeight = sc.nextDouble();
			double costPerKg = 0;
			if (percelWeight < 2.5)
				costPerKg = 3.50;
			else if (percelWeight >= 2.5 && percelWeight <= 5)
				costPerKg = 2.85;
			else if (percelWeight > 5 )
				costPerKg = 2.45;
			double deliveryCharge = percelWeight * costPerKg;
			System.out.println("Delievery Charges is: "+ deliveryCharge);
		
		}
		}

}
