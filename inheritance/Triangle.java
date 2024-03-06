package inheritance;

public class Triangle extends TwoDshape {
	String style;
	double area() { return width * height; }
	void showStyle() {
		System.out.println("Triangle is " + style);

}
}