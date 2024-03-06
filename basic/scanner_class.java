package basic;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String stuName,classNo;
	int age;
	try (Scanner sc = new Scanner (System.in)) {
		System.out.println("Enter Student Name: ");
		stuName =sc.nextLine();
		System.out.println("Enter Class Number: ");
		classNo=sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
	}
	System.out.println("Student Data");
	System.out.println("Student name\t:"+stuName);
	System.out.println("Class\t\t:"+classNo);
	System.out.println("age\t\t:"+age);
	}

}
