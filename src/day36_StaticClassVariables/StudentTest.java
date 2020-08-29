package day36_StaticClassVariables;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike", 10, 1000);
		Student s2 = new Student("Ozzy", 20, 2000 );
		Student s3 = new Student("Jamal", 30, 3000);
		
		s1.school = "CybertekEU";
		s3.idNumber = 2222;
		
		System.out.println(s2.idNumber);
		System.out.println(Student.idNumber);//we can call the static variable directly with class name.
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		

		
	}

}
