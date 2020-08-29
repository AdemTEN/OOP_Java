package day36_StaticClassVariables;
import static java.lang.Math.*;

public class CalculatorTest {

	public static void main(String[] args) {
		
//		Calculator c1 = new Calculator();
//		System.out.println(c1.plus(2, 4));
		
		System.out.println(Calculator.plus(2,4));//static method we can call it direct with class.
		//like
		System.out.println(Math.floor(2));
		
		
		//like Wrapper Classes
		System.out.println(Character.isDigit('c'));
		System.out.println(PI);
		System.out.println(floor(3.14));

	}

}
