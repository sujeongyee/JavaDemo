package quiz09;

public class MainClass {
	
	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("MK080");
		s.takeOff();
		s.fly();
		s.fly();
		System.out.println(s.info());
		s.land();
		
	}

}
