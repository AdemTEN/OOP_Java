package day45_ExceprionHandling;

public class TryCatch {
	public static void main(String[] args) {
		
		try {
			
			String str = "JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(4));
			System.out.println(str.charAt(3));
			
		}catch(Exception e) {
			System.out.println("exception happening - let you know");
			
		}
		
		System.out.println("After try catch block!");
		System.out.println("Another code");
		
	}
	
	

}
