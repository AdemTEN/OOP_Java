package day37_02Inheritance;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Adem", "IT" , 3999);
        emp1.showInfo();
        System.out.println();

        Manager mangager1 = new Manager(2222, "Sinem", "SDET", 2999);
        mangager1.showInfo();
        mangager1.raiseSalary(500);
        System.out.println();
        CEO ceo = new CEO(true, "Hasan", "IT", 4500);
        ceo.showInfo();
        ceo.raiseSalary(1000);
    }




}
