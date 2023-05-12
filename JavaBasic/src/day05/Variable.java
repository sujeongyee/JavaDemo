package day05;

public class Variable {
	
	String b; // 멤버변수 (선언만 할수 있음.. 값을 초기화 할수 없다)
	       // 값을 넣어주고 싶다면 메서드 안에서.
	
	int a = 1; // 선언과 동시에 초기화는 가능함
	
	void printNum (int d){ // 매개 변수 역시 지역변수
		int c = 1; // 지역변수
		System.out.println("멤버변수:" +  a);
		System.out.println("멤버변수:" +  b);
		System.out.println("지역변수:" +  c); 
		// 지역변수는 값을 초기화 해줘야먄 사용 가능
		System.out.println("지역변수(매개변수):" + d); 
		// 매개변수는 메서드를 호출할때 꼭 전달이 되니까 사용가능
	}

}
