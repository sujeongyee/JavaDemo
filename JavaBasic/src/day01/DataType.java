package day01;

public class DataType {
	
	public static void main(String[] args) {
		
		// 정수형타입
		byte a = 127; // 까지 저장 가능
		byte a1 = -128; 
		
		short b = 32767; // 32767까지 가능
		short b1 = -32768; // 많이 안씀
		 
		int c = 2147483647; // 까지 저장 가능
		int c1 = -2147483648;
		
		long d = 123123123123123L; // 뒤에 타입 알려줘야 함
		
		//2진수, 8진수, 16진수
		int bin = 010; // 8진수는 앞에 0을 붙임
		System.out.println("8진수 010은: "+ bin + " 입니당! 헤헤헿"); // 8
		
		int bin2 = 0b111; // 2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은 : "+ bin2); //7
		
		int hexa = 0xA9;
		System.out.println("16진수 A9는 : "+ hexa); // 169
		
		System.out.println("------------------------------------");
		
		
		// 실수형 타입
		float f1 = 3.14F; // F 붙여서 타입 명시 해줌
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.14159277777F; // 소수점 밑 7자리
		double d2 = 3.141598123123; // 15자리까지 유효
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("------------------------");
		
		// true , false 만 저장 가능
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
	}

}
