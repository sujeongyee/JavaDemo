package day02;
import java.util.Scanner;
public class ForEx02 {
	
	public static void main(String[] args) {
		
		// 입력 받은 정수가 소수인지 For문으로 판별
		// (소수의 특징은 약수의 개수가 2개다)
		// 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 > ");
		int a = scan.nextInt();
		int count = 0;
		for (int b = 1 ; b <= a ; b++) {
			if(a % b == 0) {
				System.out.print(b + " ");
				count++;
			}
		}
		System.out.println("약수의 개수 : " +count);
		
		
		
//		for(int i = 1; i <= num; i++) { 쌤 답
//			if (num % i ==0) {
//				count++;
//			}
//		}
//		System.out.println(count == 2 ?);
	}

}
