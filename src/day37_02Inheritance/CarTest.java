package day37_02Inheritance;

public class CarTest {

    public static void main(String[] args) {

        HondaCivic civic1 = new HondaCivic("Honda", "Japan", "Jimmy", "Honda Civic VOLT", true,false,"black", 5, 1.5, 989);
        civic1.howIsCar();
        System.out.println(civic1.toString());

    }
}
