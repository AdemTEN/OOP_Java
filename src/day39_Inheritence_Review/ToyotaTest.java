package day39_Inheritence_Review;



public class ToyotaTest {

	public static void main(String[] args) {
		
		Toyota toyota = new Toyota(36);
		
		toyota.steer(45);
		toyota.accelerate(30);
		toyota.steer(15);
		toyota.accelerate(20);
		toyota.accelerate(-42);
		toyota.move(10, 15);
	}

	}


