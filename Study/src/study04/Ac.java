package study04;

public class Ac implements RC {
	
	private int temperature = 24;
	

	@Override
	public void on() {
		System.out.println("에어컨을 켭니다.");		
	}

	@Override
	public void up() {
		temperature++;
		if(temperature>30) {
			System.out.println("더이상 설정 온도를 올릴 수 없습니다.");
			temperature=30;
			return;
		}
		System.out.println("에어컨 온도 올리기 : " + this.temperature);		
	}

	@Override
	public void down() {
		temperature--;
		if(temperature<18) {
			System.out.println("더이상 설정 온도를 낮출 수 없습니다.");
			temperature=18;
			return;
		}
		
		System.out.println("에어컨 온도 낮추기 : " + this.temperature);
		
	}

}
