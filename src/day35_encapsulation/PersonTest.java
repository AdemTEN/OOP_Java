package day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {


		Person p =new Person();
		p.setAge(20);
		p.setName("Adem");
		p.setGender('M');
		System.out.println(p.getName());
		System.out.println(p.getGender());	
		System.out.println(p.getAge());
		System.out.println(p.toString());
		
	}

}
