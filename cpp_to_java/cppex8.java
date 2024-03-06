package cpp_to_java;

import java.util.Scanner;

public class cppex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)){
			int n;
			System.out.print("Enter Times : ");
			n = sc.nextInt();
			int a = 1,c;
			System.out.println("0"+" = "+a);
			for (int i = 1 ; i<= n ; i++) {
				c = i * a;
				System.out.println(i+" = "+c);
				a = c;
				
			}
		}
	}

}
