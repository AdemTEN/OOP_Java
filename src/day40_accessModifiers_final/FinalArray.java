package day40_accessModifiers_final;

public class FinalArray {

	public static void main(String[] args) {
	
		 final int []TEAMS = {11,10};
		 System.out.println(TEAMS[0]);
		 
		 TEAMS[0] = 15;
		 System.out.println(TEAMS[0]);
		 
		 int[] nums = new int[] {20,30,40};
		 nums = new int [] {30,50,60};
		 
		 final int[] finalNums = {23,66,77};
		 finalNums [0] = 33;
	//	 finalNums = new int [] {22,44,8};// we can not change the pointing

	}

}
