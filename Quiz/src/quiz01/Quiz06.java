package quiz01;
import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		/*
		 * if 구문 밖에 선언된 변수를 잘 활용 하세요.
		 * 
		 * 정수 3개를 입력을 받습니다.
		 * 
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력. (조건 - 같은 수는 없다.)
		 * 
		 * 입력
		 * 15 , 30 , 7 -> max : 30, mid : 15, min : 7
		 * 
		 */
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>b && a>c) {
			max = a;
			if(b>c) {
				mid = b; min = c;
			}else {
				mid = c; min = b;
			}
		}else if (b>a && b>c) {
			max = b;
			if(a>c) {
				mid = a; min = c;
			}else {
				mid = c; min = b;
			}
		}else if (c>a && c>b) {
			max = c;
			if(a>b) {
				mid = a; min = b;
			}else {
				mid = b; min = a;
			}
		}
		
		System.out.printf("max : %d, mid :%d, min: %d", max,mid,min);
		
		scan.close();
		
		
		
	}

}
