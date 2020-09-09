package day44_OOP_Review.Shapes;

import static day44_OOP_Review.Shapes.ShapeManager.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeAction {

	public static void main(String[] args) {
		
		//run the drawsquare
		
		drawSquare((Square)buildShape("square"));
		
		drawShape(buildShape("shape"));
		
		System.out.println("-------------");
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		
		drawShape(myList);
		
		
		

	}

}
