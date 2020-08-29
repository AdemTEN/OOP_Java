package day36_StaticClassVariables;

public class ContableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		 Countable o1 = new Countable();
		 Countable o2 = new Countable();
		 Countable o3 = new Countable();
		 
		 Countable o4 = new Countable();
		 
		 objectCount = o1.getinstanceCount();
		 objectCount = o2.getinstanceCount();
		 objectCount = o3.getinstanceCount();
		 
		 System.out.println(objectCount);
		 System.out.println(o2.getinstanceCount());
		 System.out.println(Countable.instanceCount);
	}

}
