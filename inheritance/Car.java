package inheritance;

public class Car extends Vehicle {
	public double calculate(){
		return super.calculate();
	}
public void main(String[]args) {
	Car c = new Car();
	System.out.println("Car speed is "+ c.calculate()+ " Kilometer per hour");
	
	
}
}
