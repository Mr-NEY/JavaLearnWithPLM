package array;

public class Book {
	public String title;
	public String author;
	private int pubDate;
	Book(String t,String a,int p){
		title = t;
		author = a;
		pubDate = p;
	}
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
