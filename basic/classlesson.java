package basic;

public class classlesson {
	int num1, num2;	
	int addition (){
		int sum = num1 + num2;
		return sum;
		}
	void substraction (int n1, int n2) {
		int result = n1 - n2;
		System.out.println("Substraction = " + result);
		}
	public static void main (String []args) {
	classlesson obj1 = new classlesson();
	obj1.num1 = 10;
	obj1.num2 = 20;
	int sum = obj1.addition();
	System.out.println("Sum = " + sum);
	obj1.substraction(10 , 5);
	
	}
}
