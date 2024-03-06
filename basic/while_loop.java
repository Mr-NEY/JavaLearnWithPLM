package basic;

import java.util.Scanner;

public class while_loop{
	public static void main(String[]args) {
		int i=0,answer =5;
		try(Scanner s=new Scanner(System.in)){
			while (i!=answer) {
			System.out.print("Can You Guess the Number : ");
			i=s.nextInt();
			if(i==answer)
				System.out.println("Right");
			else {
				System.out.println("oops! Wrong Try Again");
			if (i<answer)
				System.out.println("Too Low");
			else 
				System.out.println("Too High");
			}
			}
	}
}	
}
