package quiz02;

public class Tv {

	String company = "LG"; // 회사
	int channel; // 채널
	boolean power; //전원
	
	/*
	 * 
	 * 메서드
	 * changeChannel : int - 매개변수 채널번을 받아서 채널을 변경 , 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜기
	 * 
	 */
	Tv(){
		company = "LG";
		channel = 2;
		power = true;		
	}
	
	int changeChannel(int cha) {
		channel = cha;
		return channel;
	}
	
	void power() {
		if(power==true) {
			power=false;
		}else {
			power=true;
		}
		
	}
	
	void condition() {
		System.out.println("======Tv 제품의 정보와 상태========");
		System.out.println("이 Tv는 "+company+" 제품입니다!");
		System.out.println("지금 " + channel + "번 채널을 시청하고 계시는군요?");
		if(power) {
			System.out.println("제품이 잘 켜져있습니다~");
		}else {
			System.out.println("헉 제품이 꺼져버렸으");
		}
	}
	
	

}


