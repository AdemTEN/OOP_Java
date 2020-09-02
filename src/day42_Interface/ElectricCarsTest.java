package day42_Interface;

public class ElectricCarsTest {

	public static void main(String[] args) {
		
		//ElectricCar ec = new ElectricCar ();ERROR can not be instantiate
		
		Tesla teslaS = new Tesla("Model S", 20000, "black");
		teslaS.charge();
		teslaS.drive();
		teslaS.start();
		teslaS.stop();
		
		System.out.println("====================");
		
		Ford fusion = new Ford(2017);
	
		fusion.charge();
		fusion.drive();
		fusion.start();
		fusion.stop();
		
		System.out.println("=====================");
		
		TeslaSemi semi = new TeslaSemi("Semi", 50000, "Brown", 3.5);
		semi.charge();
		semi.drive();
		semi.load("oranges");
		semi.start();
		semi.stop();
		
		System.out.println("==========================");
		
		TeslaTruck truck = new TeslaTruck("Cybertek", 40000, "white", 4);
		truck.charge();
		truck.drive();
		truck.load("black");
		truck.start();
		truck.stop();
		
		System.out.println("==============================");
		System.out.println(teslaS.toString());
		System.out.println(fusion.toString()); 
		System.out.println(semi.toString());
		System.out.println(truck.toString());
		
		

	}

}
