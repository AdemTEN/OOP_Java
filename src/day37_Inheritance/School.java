package day37_Inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "Mike";
		person.age = 40;
		person.gender = 'M';
		
		Student student = new Student();
		student.name = "Tom";
		student.age = 25;
		student.gender = 'M';
		student.studentId = 12948;
		student.termClass = "Math";
		
		System.out.println(student.name);
		
		Employee emp = new Employee();
		emp.name = "Adem";
		emp.jobTitle = "IT";
		emp.age = 36;
		emp.gender = 'M';
		System.out.println(emp.toString());
		

	}

}
