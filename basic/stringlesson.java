package basic;

import java.util.Scanner;

public class stringlesson {

	public static void main(String[] args) {
		int wordCount = 1 , charCount = 0;
		
		try(Scanner sc = new Scanner (System.in)){
			String str;
			System.out.print("Entrer String : " );
			str = sc.nextLine();
			int size = str.length();
			System.out.println("String Length is "+ size);
			for (int index = 0; index < size; index++) {
				if (str.charAt(index)== ' ')
					wordCount++;
				if (str.charAt(index)!= ' ')
					charCount++;
				
			}		//for loop end:
			System.out.println("Number of Word is "+ wordCount);
			System.out.println("Number of Characters is "+ charCount);
			System.out.println("Convert Sring to Uppercase is "+ str.toUpperCase());

		}
		
	}
		

}
