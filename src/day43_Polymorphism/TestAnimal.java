package day43_Polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		
		//parent         //child       
		Animal dog = new Dog();//polymorphism
		
		Animal bird = new Bird();//polymorphism
		
		animal = new Cat();
		
	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}

class Cat extends Animal{}
