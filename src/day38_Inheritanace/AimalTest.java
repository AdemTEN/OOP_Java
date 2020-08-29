package day38_Inheritanace;

public class AimalTest {
    public static void main(String[] args) {


        Dog d1 = new Dog("kangal", 1, 1, 8, 30, 2, 4, 1, 25, "long silky");
        Bird b2 = new Bird("Ciko", 1, 1, 3, 2, 2, 2, 1, 0, "short silky");
        System.out.println(Dog.isAnimal);
        System.out.println(d1.getName());
        System.out.println(b2.getTeeht());
        System.out.println(b2.toString());
        System.out.println(Bird.isAnimal);

        b2.eat();
        d1.eat();


    }



}
