package day37_02Inheritance;

public class Employee {

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Bilgiler....");
        System.out.println("name = " + name);
        System.out.println("department = " + department);
        System.out.println("salary = " + salary);
    }

    public void raiseSalary(int amount) {
        System.out.println("Employees have " + amount + "raise");
        this.salary += amount;
        System.out.println("salary = " + salary);
    }
}
