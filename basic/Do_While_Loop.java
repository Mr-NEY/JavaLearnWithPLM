package basic;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
		int num;
		int answer = 6;
		do {
			System.out.println(" ");
			num = sc.nextInt();
		}while(num!=answer);
			
	 System.out.print("Congratulation");
		
		}
	}

}
