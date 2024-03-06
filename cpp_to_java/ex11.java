package cpp_to_java;
import java.util.Scanner;

public class ex11 {
public static void main(String[]args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.print("Enter total regular hours worked: ");
		int regularHours = sc.nextInt();
		System.out.print("Enter total overtime hours worked: ");
		int overtimeHours = sc.nextInt();
		int workRate = 10;
		int regularPay = regularHours * workRate ;
		double overtimePay = overtimeHours * (workRate * 1.5);
		double weeklyPay = regularPay + overtimePay ;
		System.out.println("Weekly Pay Amount is " + weeklyPay + "\s$");
		
	}
			
	
}
}
