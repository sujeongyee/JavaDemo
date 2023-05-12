package day04;

public class MethodEx07 {
	
	public static void main(String[] args) {
		
		
		// 메서드의 연쇄호출 (동기적 방식)
		// 메서드 안에서는 메서드를 호출이 가능합니다
		
		System.out.println(fac(5));
		
		// test01();
		
		// 함수(메서드)의 재귀 -> 다시 돌아온다
		
		recursive(1);
		
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
		
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");
		System.out.println("2번 메서드 종료");
	}
	
	static void recursive (int a) { // 본 메소드 안에서 본 메소드를 호출 가능
		// 함수의 재귀는 반드시 탈출의 조건이 있어야 합니다.
		
		if(a == 10) return; // 함수 종료
		
		System.out.println(a + " 호출");
		a++;
		
		recursive(a);	
		
	}
	
	static int fac(int a) {
		
		if(a == 1) {
			return 1;
			}
		
		return a * fac(a-1);
	}
	
	
	
	
}
