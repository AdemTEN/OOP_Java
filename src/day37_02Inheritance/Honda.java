package day37_02Inheritance;

public class Honda extends Car{

    String company;
    String country;
    String ceo;

   public Honda(String company, String country, String ceo, String model, boolean isAutomatic, boolean isWithBenzin, String color){
       super(model,isAutomatic, isWithBenzin, color);
       this.company = company;
       this.ceo = ceo;
       this.country = country;

   }




}
