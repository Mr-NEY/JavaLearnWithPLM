package Interface;

public class Imain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iclass ob = new Iclass();
		System.out.println("User ID      : " + ob.getUserID());
		System.out.println("Admin ID     : " + ob.getAdminID());
		System.out.println("Universal ID : " + Interface.getUniversalID());
	}
}
