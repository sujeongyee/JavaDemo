package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior w = new Warrior("전사");
		
		w.info();		
		w.bash();		
		w.info();
		
		Wizard wi = new Wizard("마법사");
		
		wi.info();
		wi.iceArrow();
		wi.info();
		
	}

		


}
