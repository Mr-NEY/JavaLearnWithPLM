package series;

public class Bytwo implements Interface{
	
	int start;
	int value;
	public Bytwo() {
		start = 0;
		value = 0;
	}
	@Override
	public int getNext() {
		value += 2;
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
