package day36_StaticClassVariables;

public class DinnerTest {

	public static void main(String[] args) {
	
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();

		System.out.println("total slice " + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("total slice " + Dinner.pizzaSlice);
		dad.takeASlice(3);
		kid.takeASlice(5);
		mom.takeASlice();
		
		System.out.println("total slice " + Dinner.pizzaSlice);
		
		
	}

}
