package day36_StaticClassVariables;

public class AllBlocks {
	
	public AllBlocks () {
		System.out.println("No Argument Constructor");
	}
	

	public AllBlocks(int x) {
		System.out.println("One argument Constructor");
	}
	
	static {
		System.out.println("First static block");
	}
	
	{
		System.out.println("First Instance Block");
	}
	
	{
		System.out.println("Second Instance Block");
	}
	
	static {
		
		System.out.println("Second static Block");
	}
	
}
