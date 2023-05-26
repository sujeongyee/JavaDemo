package study04;

public class ManualCar extends Car{
	
	
	// 추상 메서드 3개 오버라이딩 해주기
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
	
	
}
