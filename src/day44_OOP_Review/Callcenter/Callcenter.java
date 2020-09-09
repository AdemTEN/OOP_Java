package day44_OOP_Review.Callcenter;

public class Callcenter {
	
	public static void main(String[] args) {
		
		
		WhatsApp wa  =  new WhatsApp();
		wa.launch();
		wa.allOSCompatible= true;
		wa.isFree = true;
		wa.name = "WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank you");
		wa.videoCall();
		wa.accept();
		
		
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		VoiceCallable obj = new WhatsApp();

		//((MessagingApp) obj).launch();
		( (WhatsApp)obj).launch();
		
		((MessagingApp) obj).allOSCompatible= false;
		
		obj.call("Mr Tom");
		
		((WhatsApp) obj).videoCall();	
		
	
		((VideoCallable)obj).videoCall();
		
		
			
			
		
		
	}

}
