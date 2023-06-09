package study03;

public class AISpeaker extends Machine{

	String[] playList = {"Pop", "Dance", "Rock", "Classic", "R&B"};

	// 생성자
	AISpeaker(String name, int battery){
		super(name,battery);
	}

	// 메소드1 - 전원 ON 오버라이딩
	public void powerOn() {
		System.out.println("---------------------------------------");
		System.out.println("안녕하세요. " + name + "입니다!");

	}

	// 메소드2 - 전원 OFF 오버라이딩
	public void powerOff() {
		System.out.println("전원이 꺼집니다.");
		System.out.println("---------------------------------------");
	}

	// 메소드3 - 플레이리스트 번호를 매개변수로 받고, 전원 상태를 리턴하는 MusicPlay()함수
	public boolean MusicPlay(int num){
		/*
		 * 배터리 상태가 10 미만이면, "Charge Me!"를 출력하고 전원off, false 리턴
		 * 그렇지 않으면, 배터리가 10씩 줄어들고, "Playing ~~ music, battery: n" 출력, true 리턴 
		 */
		if(battery<10) {
			System.out.println("Charge Me!");
			powerOff();
			return false;
		}else {
			if(num>=0 && num <=4) { // 플레이리스트 번호 
				battery-=10;
				System.out.println("Playing "+playList[num]+" music, battery:" + battery);
				return true;
			}else {
				System.out.println("플레이리스트 번호를 다시 입력해주세요");  
				return false;
			}
		}

	}


}
