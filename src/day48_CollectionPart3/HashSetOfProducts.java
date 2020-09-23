package day48_CollectionPart3;

import java.util.*;

import day46_Collections_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {

		//Set<Product> productSet = new HashSet<>();
		Set<Product> productSet = new TreeSet<>();
		
		productSet.add(new Product("book", 25.99));
		productSet.add(new Product("book", 19.99));
		productSet.add(new Product("magazine", 25));
		productSet.add(new Product("book", 25.99));//ignore duplicates are not allowed in case of set
		
		System.out.println(productSet.toString());
		
		for (Product product : productSet) {
			System.out.println(product.getPrice());
			
		}
		System.out.println();
		
		productSet.forEach(p-> System.out.println(p.getName()));
		productSet.forEach(p-> System.out.println(p.getPrice()));
		productSet.forEach(p-> System.out.println(p.toString()));
		
		
		
		
		

	}

}
