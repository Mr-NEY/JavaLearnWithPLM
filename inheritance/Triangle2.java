package inheritance;

public class Triangle2 extends TwoDshape2 {
	String style;
	Triangle2(){
		super();
		style="none";
	}
	Triangle2(String s,double w,double h){
		super(w,h);
		style = s;
	}
	Triangle2(double x){
		super(x);
		style = "Filled";
	}
	double area() {
		return getWidth()*getHeight()/2;
		//return with*height()/2;
	}
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}