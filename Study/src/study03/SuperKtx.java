package study03;

public class SuperKtx extends Ktx{
	
	int speed = 0 ;
	
	void speedOut() {
		
		if(speed>=300) {
			System.out.println("최대속도!!!최대속도!!!!!");
			run();
			return;
		}
		
		System.out.println("현재속도 : "+speed);
		speed+=50;
		
	}
	
	void run() {
		System.out.println("고속으로 열차가 달립니다.");
		super.arrival();
	}
	
	

}
