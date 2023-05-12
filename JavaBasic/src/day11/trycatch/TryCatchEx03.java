package day11.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		// next , nextInt , nextDouble , nextLine 
		
		System.out.println("정수>"); 
		int num = scan.nextInt(); // 엔터기준 앞까지만 받음
		
		scan.nextLine(); //엔터 소비
		
		System.out.println("문자열>"); 
		String info= scan.nextLine(); // 엔터를 포함해서 받음 같이 쓰면 오류난다
		
		System.out.println(num);
		System.out.println(info);
		*/
		
		
		while(true) {
			
			try {
				
				System.out.println(">");
				int num = scan.nextInt(); // 문자 엔터값을 정상적으로 처리를 못해서
				
				System.out.println(num);
				
			} catch (Exception e) {
				
				System.out.println("숫자로 입력하실래요?"); // 문자가 계속 남아서 무한루프..?
				scan.next(); // 문자 + 엔터값을 대신 처리
				
			} //finally
			
			
		}
		
		
		
		
	}

}
