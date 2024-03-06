package array;

import java.util.Scanner;

public class ArrayL2 {
	int[]inputNumber(int size)
	{ 
	try (Scanner sc = new Scanner (System.in)){
		int number[]= new int[5];
		for (int i =0;i<5; i++) {
		System.out.print("Enter number : " );
		number[i]= sc.nextInt();		
		}
		return number;
	}
	}
	void Addition(int[]arr) {
		int sum = 0 ;
		for (int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Addition Result = "+sum);
	}
	void maxNumber(int[]arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximun Number = "+ max);
	}
	void minNumber(int[]arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Manimun Number = "+ min);
	}
	void Average(int[]arr) {
		double avg = 0 ,sum = 0;
		for (int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		
		System.out.println("Avarage Result = "+avg);
	}
public static void main (String[]args) {
//	int arr[];
//	int size = 5;
//	ArrayL2 obj1 = new ArrayL2();
//	arr = obj1.inputNumber(size);
//	System.out.println("Input Process is Done!");
//	obj1.Addition(arr);
//	obj1.maxNumber(arr);
//	obj1.minNumber(arr);
//	obj1.Average(arr);
//	System.out.println("All is Done!!");
	
}
}
