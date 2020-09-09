package Repls;

public class Q76 {

    public static void main(String[] args) {

        System.out.println(swapName("mike_tyson@gmail.com"));

    }

    public static String swapName(String email){
       if(!email.contains("_")){
           return email;
       }else {
           String name = email.substring(0, email.indexOf("_"));
           String lastname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
           String newEmail = lastname.concat("_").concat(name).concat(email.substring(email.indexOf("@")));
           return newEmail;
       }
    }
}
