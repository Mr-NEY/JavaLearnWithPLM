package polymorphism;

public class EncupsulationtSackObject {
	public static void main(String[]args) {
		int number = 1;
		Module26Encapsulation s = new Module26Encapsulation();
		while (!s.full()){
			s.push(number);
			System.out.println("Number Pushed is "+ number);
			number++;
		}
		System.out.println();
		while(!s.empty()) {
			number = s.pop();
			System.out.println("Number Poped  is "+ number);
		}
		
	}

}
