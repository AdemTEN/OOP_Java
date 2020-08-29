package day37_Inheritance;

public class EBook extends Book{

    double size;
    int page;

    public void readBook(){
        System.out.println(title + " has " + page + " page");

    }

    public void book(){
        System.out.println("price of the book is"+ price);
    }


}
