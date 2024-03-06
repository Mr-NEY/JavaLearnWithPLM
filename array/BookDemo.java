package array;

public class BookDemo {

	public static void main(String[] args) {
		Book books[] = new Book[3];
		books[0] = new
		Book("တွင်း","ဦးဘုန်း(ဓာတု)",၂၀၂၂);
	
		books[1] = new
		Book("ပြည်ထောင်စုနီတိ","ဦးနု",၁၉၉၈);
		
		books[2] = new
				Book("ဂရုမစိုက်ခြင်းအနုပညာ","ချမ်းမြေ့ဝင်း",၂၀၂၀);
//		String title = books[0].title;
//		System.out.println(title);
		
		for(int i = 0;i<books.length; i++)
			books[i].show();
		
	}

}
