package inheritance;

public class TwoDshape2 {
	private double width;
	private double height;
	// default constructor
	TwoDshape2(){
		width = height = 0.0;
	}
	TwoDshape2(double w , double h){
		width = w; 
		height = h;
	}
	TwoDshape2(double x ){
		width = height = x;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	void showDim() {
		System.out.println("Width and height are "+width+" and "+ height );
	}
}
