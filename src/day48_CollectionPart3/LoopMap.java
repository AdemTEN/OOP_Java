package day48_CollectionPart3;

import java.util.*;

import day46_Collections_part1.Product;

public class LoopMap {

	public static void main(String[] args) {

		Map<String, String> dataMap = new HashMap<>();

		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("username", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckDriver", "Bob");
		dataMap.put("storeManager", "John");

		// keySet() -> returns set with all the key in the map
		// values() -> returns all the values in the map

		System.out.println("+++++KEYS++++++");

		for (String key : dataMap.keySet()) {
			System.out.print(key + " | ");

		}
		System.out.println();
		System.out.println("+++++VALUE+++++++");

		for (String value : dataMap.values()) {

			System.out.print(value + " | ");

		}

		// KEYSs an VALUES for each loop
		for (String key : dataMap.keySet()) {

			System.out.println(key + " | " + dataMap.get(key));

		}

		// forEach Method

		dataMap.forEach((k, v) -> System.out.println(k + "|" + v));

		// DIFFERENT COMBINATIONS

		Map<Integer, Product> studentMap = new HashMap<Integer, Product>();

		Map<String, String[]> data1 = new HashMap<>();

		Map<Integer, List<String>> data2 = new HashMap<Integer, List<String>>();

		Map<Integer, List<String[]>> data3 = new HashMap<Integer, List<String[]>>();

		Map<String, Map<Integer, Integer>> data4 = new HashMap<String, Map<Integer, Integer>>();

		Map<String, Map<Integer, Product>> data5 = new HashMap<String, Map<Integer, Product>>();

	}

}
