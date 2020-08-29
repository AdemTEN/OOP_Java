package day40_accessModifiers_final;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.model = "m3";
		c.year = 2017;
		//c.door = 4;
		c.engine = 5.2;
		System.out.println(c.toString());
		
		

	}

}
