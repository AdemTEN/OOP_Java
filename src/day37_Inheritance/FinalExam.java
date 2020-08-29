package day37_Inheritance;

public class FinalExam extends GradeActivity {

    private int numQuestion;
    private int pointEachQuestin;
    private double numMissedQuestion;

    FinalExam(int numQuestion , int numMissedQuestion){
        double numericScore;
        this.numQuestion = numQuestion;
        this.numMissedQuestion = numMissedQuestion;

        pointEachQuestin = 100 / numQuestion;
        numericScore = 100 - (pointEachQuestin * numMissedQuestion);

        setScore(numericScore);
    }
}
