package day38_Inheritanace;

public class Animal {
    public static boolean isAnimal = true;
    private  String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal(String name, int brain,int body, int size, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.brain = brain;

    }

    public void eat(){
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed){
        System.out.println("Animal.move() is called. Animal is moving at" + speed);
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
