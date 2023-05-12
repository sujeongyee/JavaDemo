package day01;
import java.util.Scanner;
public class scan01 {
	public static void main(String[] args) throws Exception {
	
//		
//		Scanner scan = new Scanner(System.in);
//		int result = scan.nextInt();
//		System.out.println("첫번째 수 : " + result);
//		int result2 = scan.nextInt();
//		System.out.println("두번째 수 : " + result2);
//		System.out.println("두 수의 핪은 : " + (result + result2));
//		
//		scan.close();
		
//		byte b = 5;
//		b = (byte)-b;
//		int result = 10 / b;
//		System.out.println(result);
		
		
//		int value = 356;
//		System.out.println(value /100*100);
//		
//		float var1 = 10f;
//		float var2 = var1 / 100;
//		System.out.println(var2);
//		if(var2==0.1) {
//			System.out.println("10% 입니다.");
//		}else {
//			System.out.println("10%가 아닙니다.");
//		}
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 수 : ");
		double num1 = scan.nextDouble();
		System.out.println("두 번째 수 : ");
		double num2 = scan.nextDouble();
//		int result = num1 / num2;
		if(num2==0) {
			System.out.println("결과 : 무한대");
		} else {
		System.out.println("결과 : " + (num1/num2));
		}
		
		
	}
	
	

}
