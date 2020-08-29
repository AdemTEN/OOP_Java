package day33_ClassObjects_Constructor;

public class Student {
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek";//default value as Cybertek.
	
	public Student(String name, int age, char gender, int year, String course ) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	public  void attendLecture() {
		
		System.out.println(this.name +" is attending");//name is belongs to object variable
	}
	public void submitAssignment() {
		
		System.out.println(this.name + " is submitting assignment");
		
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab");
		
	}

	
}
