package study03;

public class Main {
	
	public static void main(String[] args) {
		
		AISpeaker ai = new AISpeaker("지니", 25);
		
		ai.powerOn();
		System.out.println("배터리 : " + ai.battery);
		ai.MusicPlay(4);
		ai.MusicPlay(3);
		ai.MusicPlay(0);
		
		AICleaner ac = new AICleaner(10);
		ac.powerOn();
		System.out.println("배터리 : " + ac.battery);		
		ac.cleaning();
		ac.cleaning();
		ac.cleaning();
		ac.charge();
		ac.powerOn();
		System.out.println("배터리 : " + ac.battery);	
	}	

}
