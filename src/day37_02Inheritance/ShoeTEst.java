package day37_02Inheritance;

public class ShoeTEst {
    public static void main(String[] args) {

        Walking w1 = new Walking(false,"Nike" , 43.0);
        Walking w2 = new Walking(true, "Adidas", 42 );

        Running r1 = new Running(1, "NewBalance" , 42);

        System.out.println(r1.brand);

    }
}
