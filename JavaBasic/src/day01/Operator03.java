package day01;

public class Operator03 {
	
	public static void main(String[] args) {
		 
		int x = 10;
		int y = 20;
		
		//조건식 if 뒤에 소괄호가 true 이면 if 중괄호 실행, false라면 else문 실행
		if(x != 10 & ++y == 21) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		
		
		if(x == 10 | ++y == 21 ) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		
		System.out.println("------------------------");
		
		x = 10;
		y = 20;
		// 앞에만 f여도 결과는 f 이니 뒤에 연산 실행이 안됨
		if(x != 10 && ++y == 21) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		
		// 앞에만 t여도 결과는 t 이니 뒤에 연산 실행 안됨
		if(x == 10 || ++y == 21 ) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		
		
		
		
		
	}
}
