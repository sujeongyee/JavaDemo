package quiz01;
import java.util.Scanner;
public class Quiz15 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 입력 받은 수까지의 소수들의 합
		 * 입력 7
		 *  -> 바깥 반복문은 7까지 회전
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 >");
		int num = scan.nextInt();
		
		int sum = 0;
		int count =0;

		for (int i = 1 ; i < num ; i++) {
			for(int j = 1 ; j <= num ; j++) {
				if(i % j ==0) {
					count++;
				}				
			}
			if (count == 2) {
				sum += i ;
			}
			
			count = 0 ;
		}
		
		System.out.println("소수의 합 : " +sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

}


