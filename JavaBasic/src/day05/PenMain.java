package day05;

public class PenMain {
	
	public static void main(String[] args) {
		
		// 펜을 사용하려면 객체로 생성 해야합니다.
		
		Pen red = new Pen();
		
		red.ink = "빨강색";
		red.price = 2000;
		red.company = "빨간펜";
		
		red.write();
		red.info();
		
		
		Pen black = new Pen();
		
		black.ink = "검정색";
		black.price = 1500;
		black.company = "모나미";
		
		black.write();
		black.info();
		
		
	}

}
