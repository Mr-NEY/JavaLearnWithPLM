package basic;

public class BreakdoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i=1;i<=100;i++)
		{
			if ((i%2)!=0)
				continue;
			System.out.println(i);// if ((i%2)==0)
		}
		
	}

}
