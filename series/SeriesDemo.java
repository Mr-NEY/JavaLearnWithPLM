package series;

public class SeriesDemo {

	public static void main(String[] args) {
		Bytwo ob = new Bytwo();
		System.out.print("Series number of 2 : ");
		for ( int i=0; i<5; i++)
		System.out.print(ob.getNext()+ " ");
		ob.reset();
		System.out.println();
		System.out.print("Series number of 2 : ");
		for (int i=0 ; i<5; i++)
		System.out.print( ob.getNext()+" ");
		ob.setStart(200);
		System.out.println();
		System.out.print("Series number of 2 : ");
		for(int i=0; i<5 ; i++)
		System.out.print(ob.getNext()+" ");
	}

}
