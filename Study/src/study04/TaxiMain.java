package study04;

public class TaxiMain {
	
	public static void main(String[] args) {
		
		Taxi taxi = new Taxi();
		
		taxi.start();
		taxi.drive(2000);
		
		System.out.println("================");
		
		PremiumTaxi p = new PremiumTaxi();
		p.start();
		p.drive(2000);
		
		
	}

}
