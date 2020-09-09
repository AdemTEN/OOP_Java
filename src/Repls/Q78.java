package Repls;

public class Q78 {

    public static void main(String[] args) {

        smsMessage("<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}\n");

    }
    public static void smsMessage(String sms){

        String sender = sms.substring(1,sms.indexOf(">"));
        String phoneNumber = sms.substring(sms.indexOf("[")+1, sms.indexOf("]"));
        String messageBody = sms.substring(sms.indexOf("{")+1,sms.indexOf("}"));

        System.out.println("sender = " + sender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("messageBody = " + messageBody);

    }
}
