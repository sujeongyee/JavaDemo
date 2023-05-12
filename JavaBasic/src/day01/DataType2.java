package day01;

public class DataType2 {
	
	public static void main(String[] args) {
		
		// 단일 문자를 저장하는 char = 2byte
		// 문자형 데이터 타입
		char c1 = 'A';
		char c2 = 65; // A (아스키코드)
		
//		 아스키코드 - 미국에서 문자들에 숫자값을 붙임 (1byte)
//			ANSI(미국표준협회)에서 제시한 표준 코드 체계. 
//		 	ASCII는 각 문자를 7비트로 표현하므로 총 128개의 문자를 표현할 수 있다.
//		 유니코드 - 전세계 문자에 숫자값을 붙임 (2byte -부호 없는 비트체계)
//			각 나라별 언어를 모두 표현하기 위해 나온 코드 체계가 유니코드(unicode)다.
//		 	유니코드는 사용중인 운영체제, 프로그램, 언어에 관계없이 문자마다 고유한 코드 값을 제공하는 새로운 개념의 코드다. 
//		 	언어와 상관없이 모든 문자를 16비트로 표현하므로 최대 65,536자를 표현할 수 있다.

		char c3 ='가'; //
		char c4 = 44032; // 유니코드 10진수
		char c5 = '\uAC00'; // 백슬래쉬 + u 는 유니코드 나타냄
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
		// 문자열을 저장할 수 있는 String
		String s1 = "가가가가가 ";
		String s2 = "나나나나나";
		
		// 문자를 붙일때 + 를 사용하면 됩니다.
		System.out.println(s1 + s2);
		
		//문자와 다른값에 + 연산
		System.out.println(100 + 100); // 200
		System.out.println("100" + 100); // 100100 문자열에 다른값이 붙으면 문자열이 됩니다
		System.out.println(100 + 100 + "100"); // 200100
		
		String s = "100" + 100; // 100100
		System.out.println(s);
		
		System.out.println("A" + 10); // A10
		System.out.println('A' + 10); // 65+10 = 75 아스키코드로 전환
		
		
		
	}

}
