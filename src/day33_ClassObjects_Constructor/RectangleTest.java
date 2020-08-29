package day33_ClassObjects_Constructor;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle  r1 = new Rectangle();
		Rectangle  r2 = new Rectangle();
		
		r1.length  = 5.2;
		r1.width = 4.8;
		
		r2.length = 3.5;
		r2.width = 2.7;
		
		r1.x = 5;
		r1.y = 10;
 		
		System.out.println(r1.length); //whoo is giving us this default values?
		System.out.println(r2.width);

	}

}
