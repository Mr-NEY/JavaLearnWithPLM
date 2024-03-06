package array;

public class cmain {

	public static void main(String[] args) {
		Calculation.num1 = 20;
		Calculation.num2 = 10;
		Calculation.addition();
		int sub = Calculation.substraction(20, 10);
		System.out.println("Substraction = "+ sub);
		Calculation obj = new Calculation ();
		obj.multiplication(20, 10);
	}

}
