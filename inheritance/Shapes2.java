package inheritance;

public class Shapes2 {
	public static void main(String[]args) {
		Triangle2 t1 = new Triangle2();
		Triangle2 t2 = new Triangle2("outline",8,12);
		Triangle2 t3 = new Triangle2(20);
		System.out.println("****** Info for t1 *****");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println("---------------------------------------------");
		System.out.println("***** Info for t2 *****");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t3.area());
		System.out.println("***** Info for t2 *****");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area is " + t3.area());
		
		
	}
}