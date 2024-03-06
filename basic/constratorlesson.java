package basic;

public class constratorlesson {
	
		int num1, num2;
		constratorlesson(int a , int b){
			num1 = a;
			num2 = b;
			
		}
		 void addition (int a , int b, int c){
			int sum = a + b + c;
			System.out.println("Sum = " + sum);
			}
		void substraction (int n1, int n2) {
			int result = n1 - n2;
			System.out.println("Substraction = " + result);
			}
		public static void main (String []args) {
		int n1 = 10 , n2 = 13 , n3 = 12;
		constratorlesson obj1 = new constratorlesson(15,10);
		obj1.addition(n1, n2,n3);
		obj1.substraction(10 , 5);
		
		}
	}

	

