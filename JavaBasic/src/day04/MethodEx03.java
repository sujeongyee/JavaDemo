package day04;

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		
		/*
		 * return이란?
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 됩니다.?
		 * 3. 반환값(리턴)은 없을 수도 있습니다. void 로 선언합니다.
		 * 4. void 메서드에서도 return을 사용할 수 있습니다.
		 *     - 값을 돌려주지는 못하고, 종료의 의미로
		 */
		
		//System.out.println(add(1,2));
		
		int result = add(add(1,2),add(3,5));
		System.out.println("결과 : "+ result);
		System.out.println(add(add(1,2),add(3,5)));
		
		// void 형 메서드는 return이 없기 때문에 단순히 호출만 가능합니다
		// System.out.println(sub());  에러.
		sub();
		div (6,2);
		noReturn("안농~"); // 결과 : hello를 전달해야 할걸요??
		noReturn("hello"); // 결과 : 메서드를 종료함당!!
		
	 } // main

	static int add (int a, int b) {
		return a+b;
	}
	
	// 반환이 없고 매개변수도 없는 모형
	static void sub () {
		System.out.println("5 - 3 = 2");
	}	
	
	// 반환은 없고 매개변수는 있는 모형
	
	static void div(int a, int b) { // a,b여기 안에서 쓰고 버린다
		System.out.println(a + " / " + b + " = " + (a/b));		
	}
	
	// 
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("메서드를 종료함당!!");
			return;
		}
		System.out.println("hello를 전달해야 할걸요??");
		
	}

}
