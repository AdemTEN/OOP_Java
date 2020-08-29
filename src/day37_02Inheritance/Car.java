package day37_02Inheritance;

public class Car {

    private String model;
    private boolean isAutomatic;
    private boolean isWithBenzin;
    private String color;

    public Car(String model, boolean isAutomatic, boolean isWithBenzin, String color) {
        this.model = model;
        this.isAutomatic = isAutomatic;
        this.isWithBenzin = isWithBenzin;
        this.color = color;
    }

    public void howIsCar(){
        System.out.println(model+ "is very good");
    }

    public String getModel() {
        return model;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public boolean isWithBenzin() {
        return isWithBenzin;
    }

    public String getColor() {
        return color;
    }
}
