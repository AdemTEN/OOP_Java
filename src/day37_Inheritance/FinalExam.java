package day37_Inheritance;

public class FinalExam extends GradeActivity{
	
	private int numQuestion;
	private double pointsEach;
	private double numMissed;
	
	public FinalExam(int numQuestion , int numMissed) {
		double numericScore;
		
		this.numQuestion = numQuestion;
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numQuestion;
		numericScore = 100 - (numMissed * pointsEach);
		
		//my goal is recieve the letter based on my numericScore
		//how i will 
		
		setScore(numericScore);
		
	}

}
