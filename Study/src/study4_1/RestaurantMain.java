package study4_1;

public class RestaurantMain {
	
	public static void main(String[] args) {
		
		
		Menu[] m = new Menu[4]; //크기 4로 선언
		Steak s = new Steak("안심",45000,150); // 객체 생성
		m[0] = s;
		m[1] = new Drink("와인",8000,350); // 객체 생성
		m[2]= new Steak("등심",35000,160);
		m[3]= new Drink("맥주",6000,500);
		
		
		for(Menu a: m) { // 수량은 랜덤으로 넣어줬어요
			a.sell((int)(Math.random()*4)+1);
		}
		
	}

}
