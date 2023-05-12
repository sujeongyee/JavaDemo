package day01;

public class Casting01 {
	
	public static void main(String[] args) {
		
		//작은 타입을 큰 타입에 넣을때는 자동형변환이 일어남
		byte a = 10;
		
		short s = a; // byte -> short 자동형변환
		int i = a;   // byte -> int 자동형변환 
		long l = a;  // byte -> long 자동형변환
		
		// 문자와 숫자간에도 유효함
		char c = '가';
		int j = c; // char -> int형 형변환
		System.out.println(j); // 44032 '가'의 유니코드
		
		int k = 1000;
		double d = k; // int -> double
		System.out.println(d); // 1000.0
		
		// 데이터타입 크기 -> byte -> short -> int -> long -> float -> double  
		
		int x = 1;
		double y = x;
		
		int b =(int)y;
		
		
		
		
		
	}

}
