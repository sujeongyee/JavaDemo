package day01;

public class Identifier {
	public static void main (String[] args) {
		
		//대소문자를 구분함
		int age = 27;
		int Age = 28;
		
		System.out.println(age); //27
		System.out.println(Age); //28
		
		//숫자로 시작할수 없음
//		int 4num = 10; // 행 주석 - ctrl + /
		int num4 = 10;
		
		//카멜표기법
//		int phonenumber = 10;
		int phoneNumber = 10;
		
//		키워드로는 이름을 지을 수 없음 
//		int class = 10;
		
		int a; // 변수 선언
		a = 10; // 변수 초기화 작업
		System.out.println(a);
		
		// int a = 10 ; 한번에 가능
		// 프로그램에서 = 이라는 표현은 우측 값을 좌측으로 대입한다는 것
	
	}

}
