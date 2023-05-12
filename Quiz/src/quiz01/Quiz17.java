package quiz01;

import java.util.Scanner;

public class Quiz17 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int correct = 0;
		int wrong = 0;
		
		String[] a = {"+","-"};
		while(true) {
			int i = (int)(Math.random() * 100 + 1);
			int j = (int)(Math.random() * 100 + 1);
			int k = (int)(Math.random() * 2 );
			// k 가 0 일때는 더해주고 k가 1일때는 빼주기
			int result=0;
			
			System.out.println(i+" "+a[k]+" "+j+ " = ?");
			System.out.println("[ 문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int l = scan.nextInt();
			if (k==0) {
				result = i + j;
			} else {
				result = i-j;
			}
			
			if(l==0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : "+correct);
				System.out.println("오답 : "+wrong);
				break;
			}else if(result != l){
				System.out.println("오답입니다~");
				wrong++;
			}else {
				System.out.println("정답입니다~");
				correct++;
			}	
			
			System.out.println("--------------------");
		}		
	}

	

}

