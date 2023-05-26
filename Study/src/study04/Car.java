package study04;

public abstract class Car { // 부모 추상클래스 생성

	public abstract void drive(); 
	public abstract void stop(); 
	public abstract void wiper(); 
	
	public void wash() {
		
	}
	// 자동차가 시동을 켜고 주행, 시동 끄는 작업까지 실행해주는 run메서드 생성
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		wash();
		turnOff();
	}
	
	public void startCar() {
		System.out.println("시동을 켭니다."); 
	}					   
	public void turnOff() {
		System.out.println("시동을 끕니다.");
		}
	
	
	
}
