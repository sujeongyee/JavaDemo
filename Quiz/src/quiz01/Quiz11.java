package quiz01;
import java.util.Scanner;
public class Quiz11 {
	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력받습니다.
		 * 2. 입력 받은 수까지 약수의 합
		 * 
		 * 예시 
		 * 입력수 10
		 * 약수의 합 출력 1+2+5+10 
		 */
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b = 1;
		int sum = 0;
		while(b <= a) {
			if(a % b == 0) { 
				sum +=b;
			}
			b++;
		}
		System.out.println(sum);
		
		scan.close();		
	}

}
