package day41_Abstraction_Class;

public abstract class Bird extends Animal{

//	@Override
//	void eat() {
//		System.out.println("Bird is eating");
//		
//	}
//
//	@Override
//	void breathe() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
	abstract void fly();

	public Bird(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	
}
