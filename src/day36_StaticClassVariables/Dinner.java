package day36_StaticClassVariables;

public class Dinner {
	
	static int pizzaSlice = 8;
	
	public void takeASlice() {
		if(pizzaSlice<1) {
			System.out.println("there is no pizza any more");
		}else {
			pizzaSlice--;	
		}
		
	}
	
	public void takeASlice(int count) {
		if(pizzaSlice<1) {
			System.out.println("there is no pizza any more");
		}else {
			pizzaSlice -= count;
			
		}
		
		
	}
}
