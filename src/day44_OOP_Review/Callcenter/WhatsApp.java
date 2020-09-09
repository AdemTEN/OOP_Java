package day44_OOP_Review.Callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{

	/*
	public WhatsApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WhatsApp(String name, int count) {
		super(name, count);
		// TODO Auto-generated constructor stub
	}
*/
	@Override
	public void sendMessage(String msg) {
		System.out.println("WhatsApp - sending" + msg + "...");
	}

	@Override
	public void videoCall() {
		System.out.println("WhatsUpp doing video call Mr mike");
		
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - clling " + contact + "...");
		
	}
	
	

}
