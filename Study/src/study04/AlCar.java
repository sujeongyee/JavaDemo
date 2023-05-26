package study04;

public class AlCar extends Car {
	
	// 추상메서드 3개 오버라이딩
	@Override
	public void drive() {
		System.out.println("자율주행을 시작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다");
		
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼가 자동으로 작동합니다.");
		
	}
		
	
	public void wash() { // wash 오버라이딩
		System.out.println("자동으로 세차를 시작합니다.");
	}

	

}
