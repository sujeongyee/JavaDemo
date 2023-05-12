package quiz17;

import java.util.Scanner;

public class Calculator {

	public  int input () throws Exception {

		/*
		 * 1. 스캐너로 2개를 입력을 받아서 두 수의 합을 반환하는 기능
		 * 2. 입력 된 값이 정수라면 합계를 반환.
		 * 3. 예외가 발생하면 , 직접 예외를 생성하고 예외 메시지를 외부로 전달하면 됩니다.
		 * 4. scan.close() 작업은 finally에서 처리하세요
		 */

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("정수 입력 >");
			int a = scan.nextInt();
			System.out.println("정수 입력 >");
			int b = scan.nextInt();
			int result = a+b;
			return result;

		} catch (Exception e) {
			
			throw new Exception("정수를 입력해주세요!!!!!!!");
			
		} finally {
			scan.close();
		}


		
	}
}
