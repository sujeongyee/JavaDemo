package day05;

// 설계도로 사용 할 클래슨는 메인이 없습니다.
public class Pen {
	
	// 클래스 속성 (값 저장)을 나타낼때 멤버 변수 선언(field) 라고 합니다
	int price;
	String ink;
	String company;
	
	// 클래스 안에 기능을 나타낼때 , 메서드라고 부릅니다.
	
	void write() {
		System.out.println(ink + " 색깔 글씨를 씁니당~");
		
	}
	void info() {
		System.out.println("=========펜의 정보========");
		System.out.println("가격 : " + price );
		System.out.println("색상 : " + ink);
		System.out.println("제조사 : "+ company);
	}
	
}
