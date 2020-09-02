package day42_Interface;

public class Ford extends ElectricCar{
	
	private int year;

	public Ford(String model, double price, String color ) {
		super(model, price, color);
		
		
	}
	
	

	public Ford(int year) {
		this("2020", 20000, "black");
		this.year = year;
	}



	@Override
	void start() {
		System.out.println("Ford is starting by pushing start button");
		
		
		
	}

	@Override
	void charge() {
		System.out.println("Ford is charging by electric");
	
	}

	@Override
	void drive() {
		System.out.println("Ford has no outo-driver");
		
	}

	public int getYear() {
		return year;
	}
	
	
	
	

}
