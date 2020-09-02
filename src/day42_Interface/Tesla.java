package day42_Interface;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);
		
	}

	@Override
	void start() {
		System.out.println("Tesla  starts by pressing the button");
		
	}

	@Override
	void charge() {
		System.out.println("Tesla is charging by electric");
		
	}

	@Override
	void drive() {
		System.out.println("it has no outo-driver");
		
	}
	
	
	
	
	

}
