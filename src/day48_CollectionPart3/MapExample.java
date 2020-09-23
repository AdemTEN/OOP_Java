package day48_CollectionPart3;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {

		Map<String,Double> items = new HashMap<String, Double>();
		
		items.put("Apple", 3.49);
		items.put("Flowers", 10.49);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.2);
		items.put("Cherries", 4.49);
		items.put("Apple", 5.49);
	
		System.out.println(items.size());
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());
		
		System.out.println(items.get("Apple"));
		
		System.out.println(items.get("Milk"));
		
		items.remove("Flowers");
		System.out.println(items.toString());
		
		System.out.println("Is apples there? " + items.containsKey("Apple"));
		System.out.println("Is apples there? " + items.containsKey("Flowers"));
		
	
		items.replace("Eggs", 3.5);
		System.out.println(items.toString());
		
		System.out.println("Price of eggs:" + items.get("Eggs"));

		//increase price of cherries by $2;
		
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println("prices cherries "+ items.get("Cherries"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
