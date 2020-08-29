package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Question");
        int numQuestion = scan.nextInt();
        System.out.println("Enter the miss Questions");
        int missQuestion = scan.nextInt();
        FinalExam exam = new FinalExam(numQuestion, missQuestion);

        System.out.println("Grade is = " + exam.getGrade());
    }
}
