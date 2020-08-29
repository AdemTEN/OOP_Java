package day37_Inheritance;

public class Student extends Person {

	int studentId;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name + "is coding " + lang);// name come from Person class
	}
	
	public void attendClass(){
		System.out.println(name + " is attending " + termClass + " class");
	}

	
	public String toString() {
		return "Student [studentId=" + studentId + ", termClass=" + termClass + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
}
