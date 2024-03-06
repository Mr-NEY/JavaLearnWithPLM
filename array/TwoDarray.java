package array;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table[][] = new int[4][5];
		for(int i = 0 ; i<4 ; i++) {
			for(int j = 0 ;j<5 ; j++ ) {
				table[i][j]= i*j;
			}
		}
		for(int i = 0 ; i<4 ; i++) {
			for(int j = 0 ;j<5 ; j++ ) {
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
