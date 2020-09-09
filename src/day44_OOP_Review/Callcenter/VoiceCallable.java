package day44_OOP_Review.Callcenter;

public interface VoiceCallable {
	
	public final static boolean CAN_CALL = true;//or  boolean CAN_CALL = true;
	
	public abstract void call(String contact);// void call(String contact);
	
	public static void decline() {
		System.out.println("Mike dicline voice call....");
		
	}
	
	public default void accept() {
		System.out.println("Mike finally accept voice call..." );
		
	}
	

}
