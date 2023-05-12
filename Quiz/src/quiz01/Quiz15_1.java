package quiz01;
import java.util.Scanner;
public class Quiz15_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("정수 입력 > ");
		int num = scan.nextInt();
		
		int sum = 0; // 소수의 합을 누적 변수
		int count = 0; // 약수의 개수를 셀 변수 
		
		for(int i = 1 ; i <= num ; i++) {
			
			for(int j = 1 ; j <= i ; j++) {
				
				//System.out.println(i + "-" + j);
				//각자의 i 값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
				//적절한 시점 초기화...
				
				if (i % j == 0) {
					count++;
				}
				
			}// end for
			
			if (count == 2) {
				sum += i;
			}
			count=0;
		}
		
		System.out.println("입력 받은 값까지의 소수 합은? : " + sum);
		
	
	
	
	}
}
