package day43_Polymorphism;

public class InstanceOf {
	public static void main(String[] args) {

		Shape sh = new Triangle();

		if (sh instanceof Triangle) {
			System.out.println("Triangle class");

		} else if (sh instanceof Circle) {
			System.out.println("Circle class");
		}
	}

}
