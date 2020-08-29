package day37_02Inheritance;

public class Manager extends Employee {

    public int id;

    public Manager(int id,String name, String department, double salary){
        super(name, department, salary);
        this.id = id;


    }


}
