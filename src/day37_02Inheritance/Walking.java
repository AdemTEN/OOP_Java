package day37_02Inheritance;

public class Walking extends Shoe  {

  public final boolean goreTex;

    public Walking(boolean goreTex, String brand, double size){
        super(brand,size);
        this.goreTex = goreTex;
    }

}
