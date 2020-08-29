package day40_accessModifiers_final;

public final class finalMethod {

	
		
		public final  void method1() {
			System.out.println("method-1");
			String str = "abc";//==> it is immutable.
		}
	
		public static  final void staticMethod(String word) {
			System.out.println("Static Mehod");
		}

}

class Sub extends finalMethod{//final classes can not be inherited
/*
	public void method1() {
		System.out.println("method-1 in sub class");
	}
	
	public static void staticMethod(String word) {
		System.out.println("Static Method in sub class");
		
		
	}
 */

}