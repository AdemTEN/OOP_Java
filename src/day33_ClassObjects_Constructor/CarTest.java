package day33_ClassObjects_Constructor;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();// it is calling the constructor 
							// which constructer you wnt me to execute?
							// iwant u execute Constructor which doesnt have any argument
		
		System.out.println(c1.color);
		
		Car c2 = new Car("AMG", "Mercedes", 2007, 65000.0, "White");
		Car c3 = new Car("AMG", "Mercedes", 2007, 65000.0, "White", "Automatic");
		Car c4 = new Car("Corolla", "Toyota", 2010,85000 , "Gray", "Manuel");
		
		//System.out.println(c2.color);
		System.out.println(c3.type);
		System.out.println(c4.type);
		System.out.println(c3.mile);
		System.out.println(c2.make);
		System.out.println(c1.make);
	}

}
