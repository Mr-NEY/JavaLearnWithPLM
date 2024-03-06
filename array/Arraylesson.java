package array;
import java.util.Scanner;

public class Arraylesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner (System.in)){
		 int[] number = new int[10];
		 for(int i = 0 ; i<10; i++) {
		 System.out.print("Enter number : ");
		 number[i] = sc.nextInt();
		 }
		 for (int i = 0; i <10; i++) {
			 System.out.println("number["+i+"]="+number[i]);
		 }
	}

}
}