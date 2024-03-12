package Interface;

public interface Interface {
	int getUserID();
	default int getAdminID() {
		return 1;
	}
	static int getUniversalID(){
		return 22;
	}

}
