package day37_Inheritance;

public class AudioBook extends Book{

    double length;
    String narrator;


    public void listen(){
        System.out.println(author + " wrote this " + title  + " book in two years" );
    }
}
