package day33_ClassObjects_Constructor;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	public Mouse(int weight) {
		
		this.weight = weight;
	}
	public Mouse(int numTeeth, int weight) {
		
		this.numTeeth = numTeeth;
		this.weight = weight;
	}
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
	}
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	
	

}
