package day42_Interface;

public abstract class ElectricCar {
	
	private String model;
	private double price;
	private String color;
	
	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	abstract void start();
	abstract void charge();
	abstract void drive();
	
	void stop() {
		System.out.println("The car is stoping by pushing the break...");
		
	}

	public ElectricCar(String model, double price, String color) {
		super();// call the object class contructer;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
