package day46_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {

		int [] numsArray = {300,390,45,6,7};
		String [] days = new String[7];
		days[0] = "Moday";
		
		Object[] obj = {2, "apple", true};
		
		ArrayList<Integer>  numberList = new ArrayList<>();
		List<Integer> numberList2 = new ArrayList<>();
		
		Collection<Integer> numberList3 = new ArrayList<>();
		
		numberList3.add(40);
		numberList3.add(50);
		numberList3.add(100);
		
		System.out.println(numsArray[0]);
		System.out.println(numberList.get(0));
			
		
		
		
		
		
		
	}

}
