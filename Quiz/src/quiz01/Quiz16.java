package quiz01;
import java.util.Scanner;
public class Quiz16 {
	public static void main(String[] args) {
		/*
		 * updown게임
		 * 
		 * 1 ~ 10까지 랜덤한 수를 1번 생성합니다 (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력 받습니다.
		 * 랜덤 수가 입력 받은 값보다 작으면 " 더 작은수를 입력 하세요 "
		 * 랜덤 수가 입력 받은 값보다 크면 " 더 큰수를 입력 하세요"
		 * 
		 * 정답을 맞추면 시도 횟수 : x회 를 출력하고 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a = (int)(Math.random()*100)+1 ;
		int count = 0;
		
		while(true) {
			System.out.println("정답 >");
			int b = scan.nextInt();
						count++;
			if(a < b) {
				System.out.println("더 작은 수를 입력 하세요");				
			} else if(a > b) {
				System.out.println("더 큰 수를 입력 하세요");				
			} else {
				System.out.println("정답입니다");
				System.out.println("시도 횟수 : " + count );
				break;
			}
		}
		// System.out.println("시도 횟수 : " + count + " 회");
		
	}

}
