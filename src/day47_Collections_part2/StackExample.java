package day47_Collections_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
	
	public static void main(String[] args) {
		
		Vector<Integer> numsStack = new Stack<>();
		
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(500);
		numsStack.add(50);
		
		System.out.println(numsStack.toString());
		
		//check value on top of stack
		System.out.println(((Stack<Integer>)numsStack).peek());
		
		//read value on top of stack then remove it
		((Stack<Integer>)numsStack).pop();
		
		System.out.println(numsStack.toString());
		
		System.out.println(((Stack<Integer>)numsStack).peek());
		
		System.out.println(numsStack.get(0));
		
		
		
		
		
		
		
	}
	
	
	

}
