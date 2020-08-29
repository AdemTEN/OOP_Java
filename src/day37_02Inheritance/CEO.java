package day37_02Inheritance;

public class CEO extends Employee {

    boolean isMarried;

    public CEO(boolean isMarried, String name, String department, double salary ){
        super(name, department, salary);
        this.isMarried = isMarried;
    }
}
