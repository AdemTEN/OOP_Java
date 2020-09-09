package day44_OOP_Review.Shapes;

import java.util.List;

public class ShapeManager {

	public static Shape buildShape(String type) {

		Shape shape = null;
		switch (type) {
		case "diamond":
			shape = new Diamond();
			break;
		case "square":
			shape = new Square();
			break;

		case "shape":
			shape = new Shape();
			break;
		
		}

		return shape;

	}
	
	
	public static void drawSquare(Square squareObject) {
		//draw method from class
		squareObject.draw();
		
	}
	
	public static void drawShape(Shape shapeObject) {
		shapeObject.draw();
	}
	
	public static void drawShape(List<Shape> shapeList) {
		
		for(Shape each: shapeList) {
			each.draw();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
