package Repls;

public class Q77 {

    public static void main(String[] args) {

        email("craig_federighi@apple.com");

    }

    public static void email(String email){

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String levelDomain = email.substring(email.indexOf(".")+1);

        String firstNameUpperCase = firstName.substring(0,1).toUpperCase().concat(firstName.substring(1));
        String lasNameUpper = lastName.substring(0,1).toUpperCase().concat(lastName.substring(1));

        System.out.println("first name "+ firstNameUpperCase);
        System.out.println("lasNameUpper = " + lasNameUpper);
        System.out.println("domain = " + domain);
        System.out.println("levelDomain = " + levelDomain);


    }

}
