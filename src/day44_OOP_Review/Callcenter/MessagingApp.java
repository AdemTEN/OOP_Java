package day44_OOP_Review.Callcenter;

public  abstract class MessagingApp {
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messanger";
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}

	public MessagingApp() {
		System.out.println("Messaging no-arg vonstr.");
		
	}
	
	

	public MessagingApp(String name,int count) {
		
		this.name = name;
		MessagingApp.count = count;
	}

	public abstract void sendMessage(String msg);
	
	public void launch() {
		System.out.println("Messaging is launching");
		
	}
	
	public static void close() {
		System.out.println("Messaging is closing");
	}
	
	
	
	
	

}
