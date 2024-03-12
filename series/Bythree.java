package series;

public class Bythree implements Interface {
	int start;
	int value;
	public Bythree () {
		start = 0;
		value = 0;
	}

	@Override
	public int getNext() {
		value += 3;
		return value;
	}

	@Override
	public void reset() {
		value = start;	
		
	}

	@Override
	public void setStart(int a) {
		start = a;
		value = a;
		
	}

}
