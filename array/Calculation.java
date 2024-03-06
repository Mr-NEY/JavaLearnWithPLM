package array;

public class Calculation {
	static int num1 , num2;
	
	static void addition()
	{
		int sum = num1 + num2;
		System.out.println("Addition = "+ sum);
	}
	static int substraction(int a , int b)
	{
		int sub = a-b;
		return sub;
	}
	void multiplication (int n1 , int n2)
	{
		int mul = n1 * n2 ;
		System.out.println("Multiplication = "+ mul);
	}
	public static void main(String[] args) {
		num1 = 11 ;
		num2 = 21 ;
		addition() ;
		int sub = substraction (11 , 2);
		System.out.println("Substraction = "+ sub);
		
		Calculation obj = new Calculation();
		obj.multiplication(11 , 2);
		

	}

}
