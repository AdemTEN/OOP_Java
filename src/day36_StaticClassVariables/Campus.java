package day36_StaticClassVariables;

public class Campus {
	
	private String city;
	
	static String country;
	
	static {
		System.out.println("Static Block-1");
		country = "USA";
		
	}

	public Campus (String city) {
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("Static Block-2");
		country ="UK";
	}
}
