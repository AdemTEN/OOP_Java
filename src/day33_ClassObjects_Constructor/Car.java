package day33_ClassObjects_Constructor;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	String type;
	
	public Car () {//Constructor
		
		make = "BMW";
		model = "M3";
		year = 2019;
		mile = 23000;
		color = "red";
	}
	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year  =year;
		this.mile = mile;
		this.color = color;
	}
	public Car(int year, double mile, String color) {
		
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	public Car(String model, String make, int year, double mile ) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	public Car(String model, String make) {
		
		this.model = model;
		this.make = make;
	}
	public Car(String model, String make, int year, double mile, String color, String type) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
		this.type = type;
	}
	public Car(String model) {
		
		this.model = model;
	}
	
	
	
	
	
	
	
}
