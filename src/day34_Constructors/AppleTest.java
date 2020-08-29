package day34_Constructors;

public class AppleTest {

	public static void main(String[] args) {
	
		Apple apple = new Apple();
		System.out.println(apple.color);
		changeApple(apple);
		System.out.println(apple.color);
		apple.mA();
		
		System.out.println(methodObject().color);
	}
	
	public static void changeApple(Apple app) {
		
		app.color = "White";
		
	}
	public static  Apple methodObject() {
		
		//Apple b1 = new Apple();
		return new Apple();
		
	}
}
