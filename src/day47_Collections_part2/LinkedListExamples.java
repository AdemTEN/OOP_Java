package day47_Collections_part2;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class LinkedListExamples {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new LinkedList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(399);
		numberList.add(445);
	
		System.out.println(numberList.get(0));
		
		System.out.println(((LinkedList)numberList).getFirst());// i need to down casting because method belongs to LInkedList
 		
		((LinkedList)numberList).addFirst(1);
		((LinkedList)numberList).addFirst(99);
	}

}
