package day01;

public class Casting02 {
	
	public static void main(String[] args) {
		
		// 데이터타입 크기 -> byte -> short -> int -> long -> float -> double 
		
		System.out.println(Math.random());
		
		
		
		
		//크기가 큰 타입을 작은 타입에 넣을 때는 (type) 캐스팅을
		//사용해서 명시적으로 변환해줍니다.
		int i = 70;
		char c = (char)i; // 캐스팅
		short s = (short)i;
		System.out.println(c); // F
		System.out.println(s); // 70
		
		
		float f = 3.14F;
		int k = (int)f;
		System.out.println(k); //3
		
		// 주의할 점 - 타입 변환 시 값을 받을 수 없는 범위가 들어오면 잘려나간 값(쓰레기) 값을 저장합니다.
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b); // -24 미지의 세계
		
		//특이케이스 - 문자와 숫자간에도 명시적 형변환이 들어갑니다.
		
		char cc = 'A';
		short ss = (short)cc;
		
		System.out.println(ss); // 65 A의 아스키코드
		
		
		
	}

}
