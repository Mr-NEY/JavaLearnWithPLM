package series;

public interface Interface {
int getNext();
default int[]getNextArray(int n){
	
	int values[] = new int[n];

	for (int i=0; i<n; i++)
	values[i] = getNext();
return values;

}
void reset();
void setStart(int a);
}
