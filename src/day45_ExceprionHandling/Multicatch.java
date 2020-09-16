package day45_ExceprionHandling;

public class Multicatch {
	public static void main(String[] args) {
		
		try {
			
			//System.out.println(4/0);
			//String str = null;
			//System.out.println(str.toUpperCase());
			
			int[] n = {10,4};
			System.out.println(n[2]);
			
		}catch(ArithmeticException e) {
			System.out.println("aritmetic exceeption happen");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException exceeption happen");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("chatched");
		}
	}

}
