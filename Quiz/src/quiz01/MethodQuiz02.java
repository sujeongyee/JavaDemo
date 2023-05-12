package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		/*
		// 정수 2개를 받아서 합을 출력하는 문장
		// 1. 반환 x , 매개변수 x
		System.out.println("[두 수의 합을 구합니다]");
		
		// 2. 한번 만들어서 2번 호출 (반환 o, 매개변수 x input)
		Scanner scan = new Scanner(System.in);		
		System.out.println("정수 입력 > ");		
		int num1 = scan.nextInt();
		
		System.out.println("정수 입력 > ");	
		int num2 = scan.nextInt();
		
		// 두 수의 합을 리턴하는 메서드 add()
		int result = num1 + num2;
		
		// 결과를 받아서 출력하는 메서드 매개변수 = result 단순히 출력하는 print();
		System.out.println("두 수의 합은 : " + result);
		*/
		
		show();
		int num1 = input();
		int num2 = input();
		int result = (add(num1,num2));
		print(result);
		
	}
	
	static void show() {
		System.out.println("[두 수의 합을 구합니다]");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 >");
		int num = scan.nextInt();
		return num;
	}
	static int add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	static void print(int result) {
		System.out.println("두 수의 합은 : " + result);
	}

}
