package series;

public class SeriesDemo2 {

	public static void main(String[] args) {
		Bythree obj = new Bythree ();
		System.out.print("The series of 3 : ");
		for (int i=0; i<5; i++)
			System.out.print(obj.getNext()+" ");
		obj.reset();
		System.out.println();
		System.out.print("The series of 3 : ");
		for(int i=0; i<5 ; i++)
			System.out.print(obj.getNext()+" ");
		obj.setStart(30);
		System.out.println();
		System.out.print("The series of 3 : ");
		for(int i=0 ; i<5 ; i++)
			System.out.print(obj.getNext()+" ");



	}	

}
