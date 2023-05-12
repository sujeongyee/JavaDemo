package day02;
import java.util.Scanner;
public class WhileExam03 {
	
	public static void main(String[] args) {
		
		// 어떤 수를 입력받아서 입력받은 수가 (소수) 인지 판별.
		// 소수 - 나누어 떨어지는 수가 1과 자기 자신인 수
		// 소수의 특징 : 자기보다 작은수로 나눴을때 나머지가 없는 애들이 없다! (2,3,4,5~ 0이 나올때까지)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("판별한 소수를 입력 > ");
		int num = scan.nextInt();
		
		// 패션의 기본 -> 심플
		
		int i = 2;
		while (num % i !=0 ) {
			i++;	
		}
		System.out.println(num == i ? num + "은 소수" : num + "은 소수가 아님");
		
		
		
		
		
		
	}

}
