package day37_Inheritance;

public class StaticBlock {

	public static void main(String[] args) {
		 new name().s();
		

	}

}


 class name{
	
	 static {
		 System.out.println("hello World");
	 }
	public static void s() {
		System.out.println("s");
	}
}
