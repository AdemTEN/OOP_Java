package day36_StaticClassVariables;

public class StaticMethod {
	
	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
		show4();
		//show2(); u can not call instance method /variable from static method
		System.out.println(name);
		//System.out.println(age);
	}

	public void show2() {
		show1();
		System.out.println(name);
		System.out.println(age);
	}
	
	public void show3() {
		
		show2();
		show1();
		
	}
	
	public static void show4() {
		
	}
}
