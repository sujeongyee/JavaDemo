package quiz01;
import java.util.Scanner;
public class Quiz14 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 가로, 세로 길이를 입력을 받습니다.
		 * 2. 가로, 세로 길이만큼 사각형을 출력합니다.
		 * 3. 단 , 윤곽만 나오게?
		 * 
		 * *****
		 * *sss*
		 * *sss*
		 * *****
		 */
		
		
		
		
		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("가로 > ");
//		int i = scan.nextInt(); //가로
//		System.out.println("세로 > ");
//		int j = scan.nextInt(); //세로
//		
//		for (int a =1; a <=j;a++) {			
//			for (int b =1 ; b<=i ;b++) {
//				if(a==1 || b==1 || a==j || b==i) {
//					System.out.print("*");}
//				else {
//					System.out.print(" ");
//				}			
//			}
//			System.out.println();
//		}
		// 쌤풀이
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 > ");
		int w = scan.nextInt(); //가로
		System.out.print("세로 > ");
		int h = scan.nextInt(); //세로
		
		
		for(int i =1 ; i <= h ; i++) {
			for(int j = 1 ; j <= w; j++) {
				if(i==1||i==h) {
					System.out.print("*");
				}else {
					if (j==1|| j==w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}

}
