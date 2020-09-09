package day44_OOP_Review.Shapes;

public class shapeTest {

	public static void main(String[] args) {
		
		//create 3 shapes, using poly..
		Shape sh = new Shape();
		Shape diamond = new Diamond();
		Shape square = new  Square();
		Object shapeObject = new Shape();
		
		sh.draw();
		diamond.draw();
		square.draw();
		
		((Square)square).squareMethod();
		
		
		
		
		
		
		
		
	}

}
