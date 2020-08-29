package day36_StaticClassVariables;

public class CampusTest {

	public static void main(String[] args) {
		//First and one time static blocks  than other methods.
		Campus c2 = new Campus("McLean");
		Campus c1 = new Campus("Arlington");
		
		System.out.println(Campus.country);
		System.out.println(c1.country);
	}

}
