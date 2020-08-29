package day40_accessModifiers_final;

public class MethodHiding {
	
	public static void main(String[] args) {
		
		
	}

}

class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Panda extends Bear {
	
	public static void eat() {
		System.out.println("Panda is eating");// Method Hiding
	}
	public  void sneeze() {
		System.out.println("Panda is sneezing");// it is need static parent static child also must static
	}
	
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
	
}
