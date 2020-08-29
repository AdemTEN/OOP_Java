package day36_StaticClassVariables;

public class Countable {
 
	static int instanceCount;

	
	public Countable() {
		instanceCount++;
	}
	
	public int getinstanceCount() {
		return instanceCount;
	}
}
