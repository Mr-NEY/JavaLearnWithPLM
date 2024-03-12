package series;

public class SeriesDemo3 {
public static void main (String[]args) {
	Bytwo ob = new Bytwo();
	int Series2[] = ob.getNextArray(10);
	for(int a:Series2)
	System.out.print(a+" ");
	System.out.println();
	Bythree obj = new Bythree();
	int Series3[] = obj.getNextArray(20);
	for (int b:Series3)		
		System.out.print(b+" ");
}

}
