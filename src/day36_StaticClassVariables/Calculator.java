package day36_StaticClassVariables;

public class Calculator {
	
	int c;
	public static double plus(double n1, double  n2) {//static method. there is no dependency on instance variable
		return n1+n2;								  //we can call this methods with Classname
													  // like Wrapperclasses. character.isLetter('c'); 
	}
	public static double minus(double n1, double  n2) {
		return n1-n2;
	}
	public static double multiply(double n1, double  n2) {
		return n1*n2;
	}
	
	public  void number(int x) { // whenever we use instance variable inside the method. it is called 
								// instance variable.
		this.c = x;
	}
	
}

	
