package day38_Inheritanace;

public class Bird extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeht;
    private String coat;

    public Bird(String name,int brain, int body, int size, int weight, int eyes, int legs, int tail,int teeht,String coat){
        super (name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeht = teeht;
        this.coat = coat;
    }

    public void sing(){
        System.out.println("Bird.sing() is called ");



    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeht() {
        return teeht;
    }

    public String getCoat() {
        return coat;
    }

    @Override
    public String toString() {
        return "Bird{}";
    }
}
