package Repls;

public class Q74 {

    public static void main(String[] args) {

        System.out.println(isHasName("dear alejandro.....alot of text", "alejandro"));
    }

    public static String isHasName(String email, String name){
        if(email.contains(name)){
            return "read this email";
        }else{
            return "don't read";
        }

    }




}
