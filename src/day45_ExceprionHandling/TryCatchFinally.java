package day45_ExceprionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {

		String str = "Selenium";
		
		try {
			
			System.out.println(str.length());
			System.out.println(str.charAt(1000));
			
		}catch(Exception e) {
			System.out.println("Enter correct index");
			return;//stop the execution stop main method
		}finally {
			System.out.println("finally Block");
		}
		System.out.println("bye");
		
	}

}
