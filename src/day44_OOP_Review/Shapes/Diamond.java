package day44_OOP_Review.Shapes;

public class Diamond extends Shape{

	public Diamond() {
		type = "diomand";
	}

	@Override
	public void draw() {

		System.out.println("Drawing a diamond");
	}
	
	
}
