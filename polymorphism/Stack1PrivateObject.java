package polymorphism;

public class Stack1PrivateObject {
public static void main(String[]args) {
	int number = 1;
	StackPrivate s = new StackPrivate();
	while (s.push(number)) {
		System.out.println("Number Pushed is "+ number);
		number++;
	}
	System.out.println();
	boolean thereAreItems=true;
	while(thereAreItems) {
		number = s.pop();
		if(number!=-1) {
		System.out.println("Number Poped  is "+ number);
	}
	else 
		thereAreItems = false;
		
	}
}
}
