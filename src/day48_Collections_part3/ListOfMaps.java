package day48_Collections_part3;

import java.util.*;

public class ListOfMaps {

	public static void main(String[] args) {

		List<Map<String, String>> employees = new ArrayList<>();

		Map<String, String> emp1Data = new HashMap<String, String>();

		emp1Data.put("EmpID", "123");
		emp1Data.put("EmpName", "John");
		emp1Data.put("JobTitle", "SDET");
		emp1Data.put("Salary", "10000");

		Map<String, String> emp2Data = new HashMap<String, String>();
		emp2Data.put("EmpID", "124");
		emp2Data.put("EmpName", "Mike");
		emp2Data.put("JobTitle", "Developer");
		emp2Data.put("Salary", "12000");

		employees.add(emp1Data);
		employees.add(emp2Data);

		System.out.println(employees.toString());
		System.out.println(employees.get(0));

		System.out.println(employees.get(1).get("EmpName"));

		// print total salary
		/*
		 * int salary = 0; for (int i = 0; i < employees.size(); i++) { salary+=
		 * 
		 * Integer.parseInt(employees.get(i).get("Salary"));
		 * 
		 * }
		 * 
		 * System.out.println("Total salary:"+ salary);
		 */
		
		int totalSalary = 0;
		for (Map<String, String> employee : employees) {
			totalSalary += Integer.parseInt(employee.get("Salary"));
		}
		System.out.println("Total Salary:" + totalSalary);
	}

}
