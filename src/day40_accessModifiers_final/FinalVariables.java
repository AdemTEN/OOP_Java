package day40_accessModifiers_final;

public class FinalVariables {
	
	public final int ROSTER_MAX_RANGE= 600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	public FinalVariables() {
		MODEL_3_MAXSPEED = 200;
	//	ADMIN_USERNAME = "ozzy";
		
	}
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	static {
		ADMIN_USERNAME = "ozzy";
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		final int MAX_PASSENGER_COUNT = 5;
		final int SSN;
		SSN = 66;
		//SSN++; SSn is final we can not change it

		
		FinalVariables fv = new FinalVariables();
		System.out.println(fv.ROSTER_MAX_RANGE);
		System.out.println(fv.ROSTER_MAX_RANGE);
		System.out.println(fv.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);// same package we can directly 
		
	}

}
