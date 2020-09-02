package day42_Interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2= false;// ==> even we write static final its static final field
	
	void charge();
	void charge2();

}
