package day10.abstract_.bad;

public class MainClass {
	
	public static void main(String[] args) {
		//추상메서드가 없다면?
		//자식 클래스에서 반드신 오버라이딩을 했어야 했는데, 
		//깜빡하고 하지 않은 경우에 잘못된 메서드로 실행됨
		SeoulStore s = new SeoulStore();
		s.apple();
		s.grape();
		s.melon();
		s.orange();
	}

}
