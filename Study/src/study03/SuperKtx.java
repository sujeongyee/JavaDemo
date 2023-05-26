package study03;

public class SuperKtx extends Ktx{
	
	int speed = 0 ;
	
	void speedOut() {
		
		if(speed>=300) { // 300이 넘으면 run으로 넘어갑니다
			System.out.println("최대속도!!!최대속도!!!!!");
			run();
			return;
		}
		// 50 올려주기
		System.out.println("현재속도 : "+speed);
		speed+=50;
		
	}
	
	void run() { // 고속 메세지를 띄어주고 도착 메서드로..
		System.out.println("고속으로 열차가 달립니다.");
		super.arrival();
	}
	
	

}
