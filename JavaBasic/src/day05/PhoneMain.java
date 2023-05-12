package day05;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone black = new Phone();
		black.info();
		
		
		Phone pink =new Phone("아이폰14");
		pink.info();
		
		Phone red = new Phone("TTL","빨강");
		red.info();
		
		Phone white = new Phone("제트플립", 20000);
		white.info();
		
		
		//model , color , price를 매개변수로 받아서 초기화 하는 생성자를 만들어보세요 
	
		
		Phone purple = new Phone("플립4","보라색",20000);
		
		purple.info();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
