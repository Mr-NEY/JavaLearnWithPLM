package array;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int size = 5;
		ArrayL2 obj1 = new ArrayL2();
		arr = obj1.inputNumber(size);
		System.out.println("Input Process is Done!");
		obj1.Addition(arr);
		obj1.maxNumber(arr);
		obj1.minNumber(arr);
		obj1.Average(arr);
		System.out.println("All is Done!!");
		
	}

}
