package day37_02Inheritance;

public class HondaCivic extends  Honda{

    int age;
    double size;
    double weight;

    public HondaCivic(String company, String country, String ceo, String model, boolean isAutomatic, boolean isWithBenzin, String color, int age, double size, double weight) {
        super(company, country, ceo, model, isAutomatic, isWithBenzin, color);
        this.age = age;
        this.size = size;
        this.weight = weight;
    }


    public String toString() {
        return "HondaCivic{" +
                "age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                ", company='" + company + '\'' +
                ", country='" + country + '\'' +
                ", ceo='" + ceo + '\'' +
                '}';
    }
}
