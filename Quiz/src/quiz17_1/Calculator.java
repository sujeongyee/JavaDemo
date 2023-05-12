package quiz17_1;

import java.util.Scanner;

public class Calculator {
	
	public int input() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		try {
			// 예외가 발생하면 가장 가까운 catch문으로 이동됩니다.
			System.out.println("정수 입력 >");
			int a = scan.nextInt();
			int b = scan.nextInt();
			return a+b;
			
		} catch (Exception e) {
			throw new Exception("정수를 입력하세요");
		} finally {
			scan.close();
		}
		
	} 
	
	public static void main(String[] args) {
		
		Calculator car = new Calculator();
		
		try {
			System.out.println(car.input());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
