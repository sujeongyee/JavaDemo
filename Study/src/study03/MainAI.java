package study03;

public class MainAI {

	public static void main(String[] args) {
		
		System.out.println("[AI 스피커 작동 확인]");
		AISpeaker ai = new AISpeaker("지니", 25);

		ai.powerOn();
		System.out.println("배터리 : " + ai.battery);
		ai.MusicPlay(4);
		ai.MusicPlay(3);
		ai.MusicPlay(0);
		ai.charge();

		System.out.println("\n=======================================\n");
		System.out.println("[로봇 청소기 작동 확인]");

		AICleaner ac = new AICleaner(10);
		ac.powerOn();
		System.out.println("배터리 : " + ac.battery);		
		ac.cleaning();
		ac.cleaning();
		ac.cleaning();
		ac.charge();
		ac.powerOn();
		System.out.println("배터리 : " + ac.battery);	
		ac.powerOff();
	}	

}
